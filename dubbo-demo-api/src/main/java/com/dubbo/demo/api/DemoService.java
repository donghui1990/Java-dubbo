package com.dubbo.demo.api;

//定义接口 ，所有的服务的注册均需要实现 这个接口 
public interface DemoService {
	//服务方注册自己的服务 
	String sayHello(String name);
	public void SerializationTest();
	public Object test2();
	

}
