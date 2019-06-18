package org.taylor.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import org.taylor.provider.service.HelloService;

@Service(interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String message) {
        return "hello," + message;
    }
}
