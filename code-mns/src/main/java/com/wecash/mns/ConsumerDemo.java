package com.wecash.mns;

import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.CloudQueue;
import com.aliyun.mns.client.CloudTopic;
import com.aliyun.mns.client.MNSClient;

/**
 * Created by wecash on 18/11/22.
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        CloudAccount account=new CloudAccount("","","");
        MNSClient client = account.getMNSClient();
        CloudQueue queue = client.getQueueRef("");
        CloudTopic topic = client.getTopicRef("");
    }
}
