package com.alibaba.dubbo.demo.provider;

import com.dubbo.demo.api.DemoService;

public class DemoServiceImpl implements DemoService{
	public String sayHello(String name) {
		return "hello"+name;
	}

	public void SerializationTest() {
		// TODO Auto-generated method stub
		
	}

	public Object test2() {
		// TODO Auto-generated method stub
		return null;
	}

}
