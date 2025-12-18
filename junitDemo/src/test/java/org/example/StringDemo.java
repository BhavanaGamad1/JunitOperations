package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringDemo {

    @Test
    public void capitalizedString(){
        String s1="Apple";
        String s2="grapes";
        String s3="Mango";

        Stringutility sd=new Stringutility();
        assertTrue(sd.isCapitalied(s1));
        assertTrue(sd.isCapitalied(s3));



    }


}
