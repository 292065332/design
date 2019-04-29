package com.pagoda.design.factory.abstractFactory;

import com.pagoda.design.factory.abstractFactory.method.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbstractFactoryMain {

	@Test
	public void test() {
		// 国产
		IElectricalFactory electricalFactory = new ChineseElectricalFactory();

		IFan fan = electricalFactory.createFan();
		fan.swithOn();

		// 美产
		electricalFactory = new USElectricalFactory();

		ITubeLight tubeLight = electricalFactory.createTubeLight();
		tubeLight.swithOn();
		tubeLight.tuneLight();
	}
}
