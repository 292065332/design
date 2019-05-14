package com.pagoda.design.structuralModel.decorator.standardDemo;

import com.pagoda.design.structuralModel.decorator.standardDemo.Bird;
import com.pagoda.design.structuralModel.decorator.standardDemo.Component;
import com.pagoda.design.structuralModel.decorator.standardDemo.ConcreteComponent;
import com.pagoda.design.structuralModel.decorator.standardDemo.Fish;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class demoTest {

    public static void main(String[] arg)  {
        // 创造本体
        Component component =  new  ConcreteComponent();

        // 本体变小鸟
        Component bird = new Bird(component);

        bird.move();

        Component fish = new Fish(bird);

        fish.move();
    }

}
