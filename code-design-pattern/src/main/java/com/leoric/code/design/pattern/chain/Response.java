package com.leoric.code.design.pattern.chain;

/**
 * Created by wecash on 18/7/20.
 */
public class Response {

    String responseStr;

    public Response(String responseStr) {
        this.responseStr = responseStr;
    }

    public static class ResponseBuilder {
        String responseStr;

        public ResponseBuilder responseStr(String responseStr) {
            this.responseStr = responseStr;
            return this;
        }

        public Response build() {
            return new Response(this.responseStr);
        }
    }

    public static ResponseBuilder builder(){
        return new ResponseBuilder();
    }

    public String getResponseStr() {
        return responseStr;
    }

    public void setResponseStr(String responseStr) {
        this.responseStr = responseStr;
    }
}
