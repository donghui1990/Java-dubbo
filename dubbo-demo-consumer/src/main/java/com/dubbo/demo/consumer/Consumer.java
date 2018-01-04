package com.dubbo.demo.consumer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.dubbo.demo.api.DemoService;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import com.esotericsoftware.kryo.serializers.JavaSerializer;

/**
 * Hello world!
 *
 */
public class Consumer
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"classpath:META-INF/dubbo/consumer.xml"});
       context.start();
       
       DemoService demoService=(DemoService)context.getBean("demoService");
       
       
      String  hello=demoService.sayHello("Donghui");//调用服务   
       System.out.println(hello);
       
       System.out.println("现在是 序列化");
       demoService.SerializationTest();//？？？疑问：那我怎么知道是调用的哪一个类呢？还是说我可以多写一些接口呢？
       System.out.println("序列化结束");
       Kryo kryo=new Kryo();
       //对序列化的对象进行一些设置 
       //kryo.setReferences(false);
       //kryo.setRegistrationRequired(true);

      //CollectionSerializer serializer = new CollectionSerializer();
      // serializer.setElementClass(null, new JavaSerializer());
       //serializer.setElementsCanBeNull(false);

       //反序列化文件
       Input input=null;
       
      try {
		input=new Input(new FileInputStream("E:/KroTest/test.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
        System.out.println("现在是反序列化");
    
  
       ReceiveData receive=kryo.readObject(input, ReceiveData.class);
      
       input.close();
       
       //打印出数据看是否是正确的
       System.out.println("---------测试开始-------------");
       System.out.println(receive.name);
       System.out.println(receive.age1);
       System.out.println(receive.map.get("name"));
       System.out.println(receive.map.get("age"));
       System.out.println(receive.money);
      // System.out.println(receive.data.language);
      // System.out.println(receive.data.languages);
       System.out.println("---------测试结束 --------------");
       
      // ReceiveData data=(ReceiveData) demoService.test2();
       
      // System.out.println("---------测试开始-------------");
       
    //   System.out.println(data.name);
      // System.out.println(data.age);
        //System.out.println(data.map.get("name"));
      //  System.out.println(data.map.get("age"));
       // System.out.println(data.money);
        System.out.println("---------测试结束 --------------");
        
    
    }
}