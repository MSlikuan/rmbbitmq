package com.wn.util;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

@Component
public class MyFile  extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("进入过滤器");
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletResponse response = context.getResponse();
        //*允许任何域
        response.setHeader("Access-Control-Allow-Origin", "*");
        // 允许的外域请求方式
        response.setHeader("Access-Control-Allow-Methods", "POST, GET,PUT,DELETE");
        // 允许跨域请求包含某请求头,x-requested-with请求头为异步请求
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        response.setContentType("application/json;charset=utf-8");
        return null;
    }
}
