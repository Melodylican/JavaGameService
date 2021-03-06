package org.tont.core.netty.global;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class GlobalServerHandler extends ChannelInboundHandlerAdapter {
	
	private final String CLOSE = "远程主机强迫关闭了一个现有的连接。";

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		//GameMsgEntity msgEntity = (GameMsgEntity) msg;
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		if (cause.getMessage().equals(CLOSE)) {
			System.out.println("玩家 " + ctx.channel().remoteAddress() + "断开了连接");
		}
	}
}
