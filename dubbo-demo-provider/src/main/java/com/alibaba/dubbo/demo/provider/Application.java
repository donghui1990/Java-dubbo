package com.alibaba.dubbo.demo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"classpath:META-INF/dubbo/provider.xml"});
       
		context.start();
		
		System.out.println("Start Success!");
       
        System.in.read();//按任意键退出 
	}

}
