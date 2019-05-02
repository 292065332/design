package com.pagoda.design.creationModel.factory.simpleFactory;

import com.pagoda.design.creationModel.factory.simpleFactory.method.FanFactory;
import com.pagoda.design.creationModel.factory.simpleFactory.method.FanType;
import com.pagoda.design.creationModel.factory.simpleFactory.method.IFan;
import com.pagoda.design.creationModel.factory.simpleFactory.method.IFanFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

// 客户端代码
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleFactoryMain {

	@Test
	public void test() {
		IFanFactory simpleFactory = new FanFactory();
		// 使用简单工厂创建一个电扇
		IFan fan = simpleFactory.createFan(FanType.TableFan);
		fan.switchOn();
		fan.switchOff();
	}
}
