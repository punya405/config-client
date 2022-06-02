package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

@RefreshScope
@org.springframework.web.bind.annotation.RestController
public class RestController {

    //@Value("${msg:Config Server is not working. Please check...}")
    private String msg;

    @Autowired
    private Environment env;

    @GetMapping("/msg")
    public String getMsg() {
        return this.env.getProperty("msg");
    }
}
