//package com.ydj.sso.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @Author by ydj
// * @Date 2019/7/22:19 PM
// **/
//public class FirstFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext context = RequestContext.getCurrentContext();
//        HttpServletRequest request = context.getRequest();
//        String token = request.getParameter("token");
//        System.out.println("哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
//        if(token == null){
//            context.setResponseStatusCode(401);
//            context.setSendZuulResponse(false);
//            context.setResponseBody("unAuth");
//            return null;
//        }
//        return null;
//    }
//}
