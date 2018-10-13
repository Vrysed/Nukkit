package com.nukkitx.server.network.bedrock.packet;

import com.nukkitx.server.network.bedrock.BedrockPacket;
import com.nukkitx.server.network.bedrock.BedrockPacketHandler;
import io.netty.buffer.ByteBuf;
import lombok.Data;

@Data
public class ServerSettingsRequestPacket implements BedrockPacket {
    @Override
    public void encode(ByteBuf buffer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void decode(ByteBuf buffer) {
        // No payload
    }

    @Override
    public void handle(BedrockPacketHandler handler) {
        handler.handle(this);
    }
}
