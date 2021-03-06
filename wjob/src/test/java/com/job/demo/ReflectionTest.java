package com.job.demo;

import java.lang.reflect.Method;

public class ReflectionTest {

    private static int count = 0;
    public static void foo() {
        new Exception("test#" + (count++)).printStackTrace();
    }

    public static void main(String[] args) throws Exception {
        Class<?> clz = Class.forName("com.job.demo.ReflectionTest");
        Method method = clz.getMethod("foo");
        for (int i = 0; i < 20; i++) {
            method.invoke(null);
        }

        System.in.read();
    }
}
