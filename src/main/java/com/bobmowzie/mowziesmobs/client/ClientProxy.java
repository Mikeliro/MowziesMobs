package com.bobmowzie.mowziesmobs.client;

import com.bobmowzie.mowziesmobs.MowziesMobs;
import com.bobmowzie.mowziesmobs.client.gui.GuiBarakoTrade;
import com.bobmowzie.mowziesmobs.client.gui.GuiBarakoayaTrade;
import com.bobmowzie.mowziesmobs.client.render.entity.*;
import com.bobmowzie.mowziesmobs.client.sound.*;
import com.bobmowzie.mowziesmobs.server.ServerProxy;
import com.bobmowzie.mowziesmobs.server.entity.EntityHandler;
import com.bobmowzie.mowziesmobs.server.entity.barakoa.*;
import com.bobmowzie.mowziesmobs.server.entity.effects.*;
import com.bobmowzie.mowziesmobs.server.entity.naga.EntityNaga;
import com.bobmowzie.mowziesmobs.server.inventory.ContainerHandler;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.particle.DiggingParticle;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ClientProxy extends ServerProxy {
    private Entity referencedMob = null;

    @Override
    public void init(final IEventBus modbus) {
        super.init(modbus);

        modbus.register(MMModels.class);
        MinecraftForge.EVENT_BUS.register(ClientEventHandler.INSTANCE);
        MinecraftForge.EVENT_BUS.register(FrozenRenderHandler.INSTANCE);

        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BABY_FOLIAATH, RenderFoliaathBaby::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FOLIAATH, RenderFoliaath::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.WROUGHTNAUT, RenderWroughtnaut::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKO, RenderBarako::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOANA, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOAN_TO_BARAKOANA, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOAYA, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOAN_TO_PLAYER, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FROSTMAW, RenderFrostmaw::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.GROTTOL, RenderGrottol::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.LANTERN, RenderLantern::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.NAGA, RenderNaga::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.DART, RenderDart::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.SUNSTRIKE, RenderSunstrike::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.SOLAR_BEAM, RenderSolarBeam::new);
        for (EntityType boulderType : EntityHandler.BOULDERS) {
            RenderingRegistry.registerEntityRenderingHandler(boulderType, RenderBoulder::new);
        }
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.AXE_ATTACK, RenderAxeAttack::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.POISON_BALL, RenderPoisonBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.ICE_BALL, RenderIceBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.ICE_BREATH, RenderNothing::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FROZEN_CONTROLLER, RenderNothing::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.SUPER_NOVA, RenderSuperNova::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FALLING_BLOCK, RenderFallingBlock::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BLOCK_SWAPPER, RenderNothing::new);

        ScreenManager.registerFactory(ContainerHandler.CONTAINER_BARAKOAYA_TRADE, GuiBarakoayaTrade::new);
        ScreenManager.registerFactory(ContainerHandler.CONTAINER_BARAKO_TRADE, GuiBarakoTrade::new);

        ModelLoader.addSpecialModel(new ModelResourceLocation(MowziesMobs.MODID + ":wrought_axe_in_hand", "inventory"));
        for (MaskType type : MaskType.values()) {
            ModelLoader.addSpecialModel(new ModelResourceLocation(MowziesMobs.MODID + ":barakoa_mask_" + type.name + "_frame", "inventory"));
        }
    }

    @Override
    public void onLateInit(final IEventBus modbus) {
        for (EntityRenderer<?> entity : Minecraft.getInstance().getRenderManager().renderers.values()) {
            if (entity instanceof LivingRenderer) {
                ((LivingRenderer) entity).addLayer(new FrozenRenderHandler.LayerFrozen((LivingRenderer) entity));
            }
        }
    }

    @Override
    public void playSunstrikeSound(EntitySunstrike strike) {
        Minecraft.getInstance().getSoundHandler().play(new SunstrikeSound(strike));
    }

    @Override
    public void playIceBreathSound(Entity entity) {
        Minecraft.getInstance().getSoundHandler().play(new IceBreathSound(entity));
    }

    @Override
    public void playBoulderChargeSound(PlayerEntity player) {
        Minecraft.getInstance().getSoundHandler().play(new SpawnBoulderChargeSound(player));
    }

    @Override
    public void playNagaSwoopSound(EntityNaga naga) {
        Minecraft.getInstance().getSoundHandler().play(new NagaSwoopSound(naga));
    }

    @Override
    public void playBlackPinkSound(AbstractMinecartEntity entity) {
        Minecraft.getInstance().getSoundHandler().play(new BlackPinkSound(entity));
    }

    @Override
    public void minecartParticles(ClientWorld world, AbstractMinecartEntity minecart, float scale, double x, double y, double z, BlockState state, BlockPos pos) {
        final int size = 3;
        float offset =  -0.5F * scale;
        for (int ix = 0; ix < size; ix++) {
            for (int iy = 0; iy < size; iy++) {
                for (int iz = 0; iz < size; iz++) {
                    double dx = (double) ix / size * scale;
                    double dy = (double) iy / size * scale;
                    double dz = (double) iz / size * scale;
                    Vector3d minecartMotion = minecart.getMotion();
                    Minecraft.getInstance().particles.addEffect(new DiggingParticle(
                            world,
                            x + dx + offset, y + dy + offset, z + dz + offset,
                            dx + minecartMotion.getX(), dy + minecartMotion.getY(), dz + minecartMotion.getZ(),
                            state
                    ) {}.setBlockPos(pos));
                }
            }
        }
    }

    @Override
    public void solarBeamHitWroughtnaught(LivingEntity caster) {
        if (caster == Minecraft.getInstance().player) {
            long now = System.currentTimeMillis();
            if (now - ClientEventHandler.INSTANCE.lastWroughtnautHitTime > 500) {
                ClientEventHandler.INSTANCE.startWroughtnautHitTime = now;
            }
            ClientEventHandler.INSTANCE.lastWroughtnautHitTime = now;
        }
    }

    public void setTPS(float tickRate) {

    }

    public Entity getReferencedMob() {
        return referencedMob;
    }

    public void setReferencedMob(Entity referencedMob) {
        this.referencedMob = referencedMob;
    }
}
