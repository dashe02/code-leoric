package com.leoric.code.async.async.cyclicbarrier;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by wecash on 18/8/3.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Context {

    CyclicBarrier cyclicBarrier;

    List<String> resultList;
}
