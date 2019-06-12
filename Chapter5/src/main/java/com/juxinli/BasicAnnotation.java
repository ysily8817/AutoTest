package com.juxinli;

import org.testng.annotations.*;

public class BasicAnnotation {


    @Test
    public void testCase1() {
        System.out.println("TestCase1");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @Test
    public void testCase2() {
        System.out.println("testCase2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }
}
