package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class demoTest {

    @Test
    public void testadd(){
        demo d=new demo();
        int result=d.add(2,3);
        //assertEquals(5,result);
        assertNotEquals(8,result);
    }


    @Test
    public void test(){
        assertTrue(2==2);
    }

    @Test
    public void test1(){
        assertTrue("abc".length()==3);
    }


    @Test
    public void test2(){
        assertFalse("abc".length()==7);
    }

}
