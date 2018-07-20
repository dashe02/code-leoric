package com.leoric.code.design.pattern.chain;

/**
 * Created by wecash on 18/7/20.
 */
public class HTMLFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestStr = request.requestStr.replace('<', '[').replace('>', ']') +
                //后面添加的是便于我们观察代码执行步骤的字符串
                "----HTMLFilter()";
        filterChain.doFilter(request, response, filterChain);
        response.responseStr += "---HTMLFilter()";
    }
}
