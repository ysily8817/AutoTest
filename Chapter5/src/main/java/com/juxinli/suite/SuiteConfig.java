package com.juxinli.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSutie 运行啦");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite 运行结束");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("AfterTest");
    }
}
