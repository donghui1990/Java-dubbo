package com.alibaba.dubbo.demo.provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.serialize.ObjectInput;
import com.alibaba.dubbo.common.serialize.ObjectOutput;
import com.alibaba.dubbo.common.serialize.Serialization;

public class SerializationOptimizerImpl implements Serialization {
	
	 public Collection<Class> getSerializableClasses() {
	        List<Class> classes = new LinkedList<Class>();
	        classes.add(TestData.class);
	        classes.add(KryoTest2.class);
	        return classes;
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
		return null;
	}

	public ObjectInput deserialize(URL url, InputStream input) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
