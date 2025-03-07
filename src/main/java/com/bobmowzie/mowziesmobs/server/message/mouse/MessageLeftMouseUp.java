package com.bobmowzie.mowziesmobs.server.message.mouse;

import com.bobmowzie.mowziesmobs.server.capability.CapabilityHandler;
import com.bobmowzie.mowziesmobs.server.capability.PlayerCapability;
import com.bobmowzie.mowziesmobs.server.power.Power;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/**
 * Created by BobMowzie on 5/25/2017.
 */
public class MessageLeftMouseUp {
    public MessageLeftMouseUp() {}

    public static void serialize(final MessageLeftMouseUp message, final PacketBuffer buf) {

    }

    public static MessageLeftMouseUp deserialize(final PacketBuffer buf) {
        final MessageLeftMouseUp message = new MessageLeftMouseUp();
        return message;
    }

    public static final class Handler implements BiConsumer<MessageLeftMouseUp, Supplier<NetworkEvent.Context>> {
        @Override
        public void accept(final MessageLeftMouseUp message, final Supplier<NetworkEvent.Context> contextSupplier) {
            final NetworkEvent.Context context = contextSupplier.get();
            final ServerPlayerEntity player = context.getSender();
            context.enqueueWork(() -> this.accept(message, player));
            context.setPacketHandled(true);
        }

        private void accept(final MessageLeftMouseUp message, final ServerPlayerEntity player) {
            if (player != null) {
                PlayerCapability.IPlayerCapability capability = CapabilityHandler.getCapability(player, PlayerCapability.PlayerProvider.PLAYER_CAPABILITY);
                capability.setMouseLeftDown(false);
                Power[] powers = capability.getPowers();
                for (int i = 0; i < powers.length; i++) {
                    powers[i].onLeftMouseUp(player);
                }
            }
        }
    }
}