package com.juxinli;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1() {
        System.out.println("test111111111");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("test2222222222");
    }
}
