package com.wn.util;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Date;

@Slf4j
@WebFilter(urlPatterns = "/*",filterName = "logfilter")
public class LogCostFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("doFilter 请求处理");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse rep=(HttpServletResponse) servletResponse;
        String pass = servletRequest.getParameter("pass");
        log.info("pass={}",pass);
        try {
            String pass1 = pass.replaceAll(" ", "+");
            log.info("pass={}",pass1);
            PrivateKey privateKey = RSAUtils.getPrivateKey(valueKey.privateKey);
            String time = RSAUtils.decrypt(pass1,privateKey);
            String[] split = time.split(":");
            log.info("得到分割时间：{}",split[1]);
            long beginTime= Long.valueOf(split[1]);
            log.info("开始时间为：{}",beginTime);
            long endtime = new Date().getTime();
            log.info("结束时间为：{}",endtime);
            long a=endtime-beginTime;
            log.info("请求时间为：{}",a);
            if(a>1000){
                log.info("错误");
            }else {
                log.info("放行");
                filterChain.doFilter(req,servletResponse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       ;
/*
      try {
           BufferedReader reader = req.getReader();

           StringBuilder sb = new StringBuilder();
           String s;
           while((s = reader.readLine()) != null) {
               sb.append(s.trim());

           }
           String s1 = sb.toString();
           log.info("获取到字节流为： {}",s1);
           String[] split = s1.split(":");
           String pass=split[5];
           log.info("请求到的密码为：{}",pass);
           String beginTime1= split[6];
           String[] beginTime = beginTime1.split("\"");
           long bengtime =Long.valueOf(beginTime[0]);
           log.info("开始时间为：{}",beginTime[0]);
           long endtime = new Date().getTime();
           log.info("结束时间为：{}",endtime);
           long a=endtime-bengtime;
           log.info("请求时间为：{}",a);
           if(a>1000){

           }else {
               log.info("放行");
               filterChain.doFilter(req,servletResponse);
           }
           }catch (Exception e){
           e.printStackTrace();
       }*/

    }

    @Override
    public void destroy() {

    }
}
