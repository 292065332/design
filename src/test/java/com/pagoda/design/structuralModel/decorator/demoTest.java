package com.pagoda.design.structuralModel.decorator;

import com.pagoda.design.structuralModel.bridge.Abstraction;
import com.pagoda.design.structuralModel.bridge.ConcreateImplementorA;
import com.pagoda.design.structuralModel.bridge.ConcreateImplementorB;
import com.pagoda.design.structuralModel.bridge.RefinedAbstraction;
import com.pagoda.design.structuralModel.decorator.standardDemo.Bird;
import com.pagoda.design.structuralModel.decorator.standardDemo.Component;
import com.pagoda.design.structuralModel.decorator.standardDemo.ConcreteComponent;
import com.pagoda.design.structuralModel.decorator.standardDemo.Fish;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class demoTest {

    @Test
    public void test() {
        // 创造本体
        Component component =  new  ConcreteComponent();

        // 本体变小鸟
        Component bird = new Bird(component);

        bird.move();

        Component fish = new Fish(bird);

        fish.move();
    }

}