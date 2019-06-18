package org.taylor.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.taylor.provider.service.HelloService;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/hello/{message}")
    public String hello(@PathVariable String message) {

        return this.helloService.hello(message);
    }
}
