package com.esickert.testcases;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by esickert on 5/17/2017.
 */
public class Test13 {

    @Test
    public void justATestWithException() {
        try {
            throw new JavaException("This just throws an exception");
        } catch (JavaException e) {
            e.printStackTrace();
        }
    }


    @Ignore
    @Test(expected = ArithmeticException.class)  //if you comment this out the method will throw exception (fail).
    public void testDivisionWithException()    {
        int x = 1 / 0;
    }


    @Rule
    public ExpectedException expected =  ExpectedException.none(); //don't understand this yet!!!
    @Ignore
    @Test
    public void testDivisionWithRule()  {
        int x = 1 / 0;
    }

}
