package com.juxinli.MoreThread;

import org.testng.annotations.Test;

public class ThreadTest {

    @Test(invocationCount = 10)
    public void test() {
        System.out.println("a");
        System.out.printf("Thread Id : %n" + Thread.currentThread().getId());
    }
}
