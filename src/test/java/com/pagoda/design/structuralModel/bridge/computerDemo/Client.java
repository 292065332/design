package com.pagoda.design.structuralModel.bridge.computerDemo;


import com.pagoda.design.structuralModel.bridge.computerDemo.brand.Lenovo;
import com.pagoda.design.structuralModel.bridge.computerDemo.computer.Computer;
import com.pagoda.design.structuralModel.bridge.computerDemo.computer.Desktop;
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
@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

	@Test
	public void test() {
		Computer computer = new Desktop(new Lenovo());
		computer.sale();
	}

}
