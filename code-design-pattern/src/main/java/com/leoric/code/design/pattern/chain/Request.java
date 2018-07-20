package com.leoric.code.design.pattern.chain;

/**
 * Created by wecash on 18/7/20.
 */
public class Request {

    String requestStr;

    public Request(String requestStr) {
        this.requestStr = requestStr;
    }

    public static class Builder {
        String requestStr;

        public Builder requestStr(String requestStr) {
            this.requestStr = requestStr;
            return this;
        }

        public Request build() {
            return new Request(this.requestStr);
        }
    }

    public static Builder builder(){
        return new Builder();
    }

    public String getRequestStr() {
        return requestStr;
    }

    public void setRequestStr(String requestStr) {
        this.requestStr = requestStr;
    }
}
