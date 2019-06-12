package com.juxinli.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass3 {
    public void teacher1() {
        System.out.println("教师组 11111");
    }

    public void teacher2() {
        System.out.println("教师组 22222");
    }
}
