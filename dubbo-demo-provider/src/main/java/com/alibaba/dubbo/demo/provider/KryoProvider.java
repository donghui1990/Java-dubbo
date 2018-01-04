package com.alibaba.dubbo.demo.provider;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.dubbo.demo.api.DemoService;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;

//这里主要记录我所需要序列化的数据：将一个类序列化到文件，然后consumer反序列话对象 


public class KryoProvider implements DemoService {
	
	
	//首先声明 kryo对象 
	public void SerializationTest()  { 
		
    TestData testData=new TestData();
    testData.inputData();
    
	Kryo kryo=new Kryo();
	
	Output output=null;
	
	try {
		output=new Output(new FileOutputStream("E:/KroTest/test.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("现在是序列化的时间");
	
	kryo.writeObject(output,testData);
	output.flush();
	}

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "hello"+name;
	}

	public Object test2() {
		// TODO Auto-generated method stub
		return null;
	}	

	
	
}
