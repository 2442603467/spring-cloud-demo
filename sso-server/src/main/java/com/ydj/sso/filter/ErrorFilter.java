//package com.ydj.sso.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.exception.ZuulException;
//
///**
// * @Author by ydj
// * @Date 2019/7/22:26 PM
// **/
//public class ErrorFilter extends ZuulFilter {
//
//    @Override
//    public String filterType() {
//        return "error"
//    }
//
//    @Override
//    public int filterOrder() {
//        return 2;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        System.out.println("嘿嘿嘿嘿嘿嘿嘿嘿嘿嘿嘿嘿嘿嘿");
//        return null;
//    }
//}
