package com.pagoda.design.creationModel.factory.factoryMethod;

import com.pagoda.design.creationModel.factory.factoryMethod.method.IFan;
import com.pagoda.design.creationModel.factory.factoryMethod.method.IFanFactory;
import com.pagoda.design.creationModel.factory.factoryMethod.method.PropellerFanFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//客户端代码
@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryMethodMain {

	@Test
	public void test() {
		IFanFactory fanFactory = new PropellerFanFactory();

		// 使用工厂方法创建一个电扇
		IFan fan = fanFactory.createFan();

		// 使用创建的对象
		fan.swithOn();

		fan.switchOff();
	}
}
