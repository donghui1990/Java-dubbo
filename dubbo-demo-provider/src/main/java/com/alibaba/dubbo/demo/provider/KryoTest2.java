package com.alibaba.dubbo.demo.provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.serialize.ObjectInput;
import com.alibaba.dubbo.common.serialize.ObjectOutput;
import com.alibaba.dubbo.common.serialize.Serialization;
import com.dubbo.demo.api.DemoService;

public class KryoTest2 implements DemoService{
	public TestData data=new TestData();

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "hello"+name;
	}

	public void SerializationTest() {
		// TODO Auto-generated method stub
		
	}
	
	//需要增加第二种序列化的方式
	
	public Object test2() {
		
		return data;
		
	}

	public byte getContentTypeId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getContentType() {
		// TODO Auto-generated method stub
		return null;
	}

	public ObjectOutput serialize(URL url, OutputStream output) throws IOException {
		// TODO Auto-generated method stub
		//在这里增加要序列化的对象 
		
		return null;
	}

	public ObjectInput deserialize(URL url, InputStream input) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
