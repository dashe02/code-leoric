package com.leoric.code.rpc;

import java.io.IOException;

/**
 * Created by wecash on 18/8/6.
 */
public interface Server {

    public void stop();

    public void start() throws IOException;

    public void register(Class serviceInterface, Class impl);

    public boolean isRunning();

    public int getPort();

}
