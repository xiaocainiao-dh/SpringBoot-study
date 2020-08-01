package com.xiaocainiao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloWorldController {

    @RequestMapping("hello")
    public String toHello(HttpServletRequest request){
        String ip = "";
        if (request != null) {
            ip = request.getHeader("X-FORWARDED-FOR");
            if (ip == null || "".equals(ip)) {
                ip = request.getRemoteAddr();
            }
        }
        System.out.println("客户端请求的IP的地址为：" + ip);
        return "hello world";
    }

}
