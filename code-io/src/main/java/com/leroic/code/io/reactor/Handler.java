package com.leroic.code.io.reactor;

import java.io.IOException;
import java.nio.channels.SelectionKey;

/**
 * Created by wecash on 18/8/3.
 */
public interface Handler {

    void hanle(SelectionKey sk) throws IOException;
}
