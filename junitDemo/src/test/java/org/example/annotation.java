package org.example;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class annotation {

    @BeforeAll
    public static void before(){
        System.out.println("first");
    }

    @AfterAll
    public static void After(){
        System.out.println("last");
    }

    @Test
    public void test1(){
        System.out.println("Running test 1");
    }

    @Test
    public void test2(){
        System.out.println("Running test 2");
    }
}
