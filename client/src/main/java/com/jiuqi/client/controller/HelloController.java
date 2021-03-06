package com.jiuqi.client.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${springcloud.hello}")
    private String hello;

    @RequestMapping("/hello1")
    public String hello(@RequestParam String name) {
        return "hello "+name+"，producer is ready";
    }



    @RequestMapping("/helloConfig")
    public String from() {
        return this.hello;
    }

}
