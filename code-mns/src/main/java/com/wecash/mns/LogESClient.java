package com.wecash.mns;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.xpack.client.PreBuiltXPackTransportClient;

import java.net.InetAddress;

/**
 * Created by wecash on 18/11/27.
 */
public class LogESClient {

    public LogESClient() {
    }

    public static void main(String[] args) {
        System.out.println(getESClient().connectedNodes().size());
    }

    public static TransportClient getESClient() {
        return LogESClient.ESClientHolder.client;
    }

    public static class ESClientHolder {
        public static TransportClient client;
        public static String clusterName;
        public static String userName;
        public static String ip;
        public static int port;

        public ESClientHolder() {
        }

        static {
            try {
                System.setProperty("es.set.netty.runtime.available.processors", "false");
                //https://blog.csdn.net/hyneria_hope/article/details/79136380
                clusterName = "welog";
                userName = "app_capital_user:g87mXg3uWYGtA2";
                ip = "welog02.wecash.net";
                port = 9300;
                client = new PreBuiltXPackTransportClient(Settings.builder()
                        .put("cluster.name", clusterName)
                        .put("xpack.security.user", userName)
                        .put("xpack.security.transport.ssl.enabled",true)
                        .put("xpack.security.transport.ssl.verification_mode","certificate")
                        .put("xpack.security.transport.ssl.keystore.path", "/Users/wecash/Desktop/elastic-certificates.p12")
                        .put("xpack.security.transport.ssl.truststore.path", "/Users/wecash/Desktop/elastic-certificates.p12")
                        .build())
                        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(ip), port));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
