package com.pagoda.design.structuralModel.bridge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class demoTest {

    @Test
    public void test() {
        Abstraction abstraction = new RefinedAbstraction();

        //调用第一个实现类
        abstraction.setImplementor(new ConcreateImplementorA());
        abstraction.operation();

        //调用第二个实现类
        abstraction.setImplementor(new ConcreateImplementorB());
        abstraction.operation();

    }

}
