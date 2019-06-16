package com.hs.example.aop;

import com.hs.example.aop.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void sayHelloNormal() {
        helloService.sayHello("zs");
    }

    @Test
    public void sayHelloError() {
        helloService.sayHello("");
    }

}
