package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MethodDemo {

    int x=2;
    int y=2;
    int z=3;


    @Test
    public void test1(){
        assertEquals(x,y);
    }


    @Test
    public void test2(){
        assertNotEquals(y,z);
    }


}
