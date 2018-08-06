package com.leroic.code.io.reactor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

/**
 * Created by wecash on 18/8/3.
 */
public class EventHandler implements Handler {

    SocketChannel socketChannel;

    SelectionKey selectionKey;

    ByteBuffer readBuffer = ByteBuffer.allocate(Integer.MAX_VALUE);

    public void hanle(SelectionKey sk) throws IOException {

    }
}
