package com.jpeony.sunflower.remoting.netty;

import com.jpeony.sunflower.remoting.protocol.RemotingCommand;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author yihonglei
 */
public interface NettyRequestProcessor {
    void processRequest(ChannelHandlerContext ctx, RemotingCommand request)
            throws Exception;

    boolean rejectRequest();
}
