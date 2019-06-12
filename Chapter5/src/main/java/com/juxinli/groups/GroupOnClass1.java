package com.juxinli.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {

    public void stu1() {
        System.out.println("学生1组 11111");
    }

    public void stu2() {
        System.out.println("学生1组 22222");
    }
}
