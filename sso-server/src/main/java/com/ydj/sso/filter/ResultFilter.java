//package com.ydj.sso.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.exception.ZuulException;
//
///**
// * @Author by ydj
// * @Date 2019/7/22:27 PM
// **/
//public class ResultFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        return "post";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 3;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        System.out.println("嘎嘎嘎嘎嘎嘎嘎嘎嘎");
//        return null;
//    }
//}
