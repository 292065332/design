package com.pagoda.design.builder;

import com.pagoda.design.builder.method.McFood;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderTests {

    @Test
    public void test() {
        McFood food = new McFood.Builder()
                .drink(new McFood.Drink(McFood.Drink.DRINK_COLA))
                .addIce(false)  //去冰
                .hamburg(new McFood.Hamburg(McFood.Hamburg.HAMBURG_BEEF))  //牛肉汉堡
                .takeOut(true)  //外带
                .totalCount(3)  //总共*3
                .create();
        System.out.println(food.toString());
    }

}
