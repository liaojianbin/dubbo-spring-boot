package cn.itcast.springboot.service.impl;

import cn.itcast.springboot.service.TestService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = TestService.class)
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}