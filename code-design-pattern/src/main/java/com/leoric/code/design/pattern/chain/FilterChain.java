package com.leoric.code.design.pattern.chain;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by wecash on 18/7/20.
 */
public class FilterChain implements Filter {

    List<Filter> filterList = Lists.newArrayList();

    int index = 0;

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filterList.size()) {
            return;
        }
        Filter filter = filterList.get(index);
        index++;
        filter.doFilter(request, response, filterChain);
    }
}
