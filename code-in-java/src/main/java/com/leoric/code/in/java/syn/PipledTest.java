package com.leoric.code.in.java.syn;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Created by wecash on 18/9/20.
 */
public class PipledTest {

    public static void main(String[] args) throws IOException {

        WriteThread writeThread = new WriteThread();

        ReadThread readThread = new ReadThread();

        writeThread.getOut().connect(readThread.getIn());

        writeThread.start();

        readThread.start();
    }

}

class WriteThread extends Thread {

    private PipedWriter out=new PipedWriter();

    public PipedWriter getOut() {
        return out;
    }

    @Override
    public void run() {
        try {
            out.write("hello concurrent world!".toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class ReadThread extends Thread {

    private PipedReader in=new PipedReader();

    public PipedReader getIn() {
        return in;
    }

    @Override
    public void run() {
        try {
            char[] buffer = new char[2048];
            int read = in.read(buffer);
            System.out.println("结果:" + new String(buffer, 0, read));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
