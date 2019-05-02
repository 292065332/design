package com.pagoda.design.creationModel.factory.springBeanFactory;

import com.pagoda.design.factory.Moveable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignApplicationTests {

    @Test
    public void test() {
        try {
            BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
            Object o = factory.getBean("c");
            Moveable m = (Moveable) o;
            m.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
