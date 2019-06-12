package com.juxinli.suite;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("服务器端方法111111111");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("服务器端方法2222222222");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("客户端端方法111111111");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("客户端端方法2222222222");
    }

    @BeforeGroups("server")
    public void beforGroups() {
        System.out.println("服务器端分组开始！！！！！");
    }

    @AfterGroups("server")
    public void afrerGroups() {
        System.out.println("服务器端分组结束！！！！");
    }

    @BeforeGroups("client")
    public void beforGroupsClient() {
        System.out.println("客户端分组开始！！！！！");
    }

    @AfterGroups("client")
    public void afrerGroupsClient() {
        System.out.println("客户端分组结束！！！！");
    }
}
