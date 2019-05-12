package com.pagoda.design.structuralModel.adapter.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 客户端类
 * (相当于例子中的笔记本，只有高清线接口)
 * @author Administrator
 *
 */
public class Client {
	
	public void HDMI(Target t){
		t.handleReq();
	}

	public static void main(String[] arg) {

		Client  c = new Client();

		Adaptee a = new Adaptee();

		Target t = new Adapter();

		//Target t = new Adapter2(a);

		c.HDMI(t);
	}

}
