package com.pagoda.design.creationModel.singleton;

import com.pagoda.design.creationModel.singleton.demo.EagerSingleton;
import com.pagoda.design.creationModel.singleton.demo.IdlerSingleton;
import com.pagoda.design.creationModel.singleton.demo.Singleton;
import com.pagoda.design.creationModel.singleton.demo.User;
import com.pagoda.design.singleton.demo.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonTests {

    /**
     * 饿汉式
     */
    @Test
    public void singletonDemo1() {
        EagerSingleton instance = EagerSingleton.getInstance();

        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.err.println(instance == instance2);
    }


    /**
     * 懒汉式
     */
    @Test
    public void singletonDemo2() {
        IdlerSingleton instance = IdlerSingleton.getInstance();

        IdlerSingleton instance2 = IdlerSingleton.getInstance();
        System.err.println(instance == instance2);
    }

    /**
     * 懒汉式 - 多线程测试
     */
    @Test
    public void singletonDemo3() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            //IdlerSingleton instance = IdlerSingleton.getInstance();
            //IdlerSingleton2 instance = IdlerSingleton2.getInstance();
            Singleton instance = Singleton.getInstance();
            System.out.println("线程 " + threadName + "\t => " + instance.hashCode());
        };
        // 模拟多线程环境下使用 Singleton 类获得对象
        for (int i = 0; i < 100; i++) {
            new Thread(task, "" + i).start();
        }
    }

    /**
     * 枚举类型
     */
    @Test
    public void singletonDemo4() {
        for (int i = 0; i < 10; i++) {
            User user = User.Instance;
            user.print();
        }

    }

}
