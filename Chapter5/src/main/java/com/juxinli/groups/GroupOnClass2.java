package com.juxinli.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass2 {

    public void stu1() {
        System.out.println("学生222组 11111");
    }

    public void stu2() {
        System.out.println("学生222组 22222");
    }
}
