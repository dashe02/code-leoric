package com.leoric.code.async.async.countdown;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by wecash on 18/8/3.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Context {

    private CountDownLatch latch;

    private List<String> resultList;

}
