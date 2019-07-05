//package com.ydj.sso.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.exception.ZuulException;
//
///**
// * @Author by ydj
// * @Date 2019/7/22:23 PM
// **/
//public class SecondFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        return "routing";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 1;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        System.out.println("凄凄切切凄凄切切凄凄切切去");
//        return null;
//    }
//}
