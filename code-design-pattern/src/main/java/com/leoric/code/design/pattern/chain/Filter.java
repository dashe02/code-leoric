package com.leoric.code.design.pattern.chain;

/**
 * Created by wecash on 18/7/20.
 */
public interface Filter {

   void doFilter(Request request,Response response,FilterChain filterChain);
}
