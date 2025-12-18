package org.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class arraysdemo {

    @Test
    public void assertequal(){
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        int[] arr3={1,2,3,4};

        assertArrayEquals(arr1,arr2);
        //assertArrayEquals(arr1,arr3);

    }



}
