package com.alibaba.dubbo.demo.provider;

import java.io.Serializable;
import java.util.HashMap;


public class TestData {
	public String name="donghui";
	public int age=10000000;
	public HashMap<String,String>map=new HashMap<String,String>();
	
	//定义自定义的数据类型
	//public Data data=new Data();
	
	public String  money="9999999";
	//对map中增加数据 
		public void inputData() {
			map.put("name","donghui");
			map.put("age","27");
			
		}	
}

