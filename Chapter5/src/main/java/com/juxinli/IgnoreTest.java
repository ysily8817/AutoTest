package com.juxinli;

import org.testng.annotations.*;

public class IgnoreTest {

    @Test(enabled = false)
    public void ignore1() {
        System.out.println("忽略测试1");
    }

    @Test(enabled = true)
    public void ignore2() {
        System.out.println("忽略测试2");
    }
}
