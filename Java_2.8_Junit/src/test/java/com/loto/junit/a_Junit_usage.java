package com.loto.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author：蓝田_Loto
 * Date：2018-12-25 18:55
 * PageName：com.loto.junit.a_Junit_usage.java
 * Function：Junit的使用
 */

public class a_Junit_usage {
    @Test
    public void Test() {
        System.out.println("@Test，需要执行的测试方法");
    }

    @Before
    public void before() {
        System.out.println("@Before，在测试方法前执行");
    }

    @After
    public void after() {
        System.out.println("@After，在测试方法后执行");
    }
}
