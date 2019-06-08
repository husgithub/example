package com.hs.example.javaproxy;

import com.hs.example.javaproxy.intercept.MyInterceptor;
import com.hs.example.javaproxy.proxy.ProxyBean;
import com.hs.example.javaproxy.service.HelloService;
import com.hs.example.javaproxy.service.impl.HelloServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
		HelloService helloService = new HelloServiceImpl();
		helloService.sayHello("zs");
	}

	@Test
	public void proxyTest(){
		HelloService helloService2 = (HelloService)
				ProxyBean.getProxyBean(new HelloServiceImpl(),new MyInterceptor());
		helloService2.sayHello("lisi");
	}

}
