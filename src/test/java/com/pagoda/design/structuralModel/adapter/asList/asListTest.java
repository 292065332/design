package com.pagoda.design.structuralModel.adapter.asList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class asListTest {

    @Test
    public void test() {
        /**使用变长参数*/
        List<String> array1 = Arrays.asList("Welcome", "to","Java", "world");
        System.out.println(array1);

        /**使用数组*/
        List<String> array2 = Arrays.asList(new String[] {"Welcome", "to","Java", "world"});
        System.out.println(array2);
    }


}
