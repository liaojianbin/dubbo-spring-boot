package cn.itcast.springboot.controller;

import cn.itcast.springboot.service.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping
    public String sayHello(String name) {
        return testService.sayHello(name);
    }
}
