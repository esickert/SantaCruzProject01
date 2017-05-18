package com.esickert.testcases;

import org.junit.Test;

/**
 * Created by esickert on 5/17/2017.
 */
public class Test14 {

    @Test
    public void justATestWithException() {
        try {
            throw new JavaException("This just throws an exception");
        } catch (JavaException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = ArithmeticException.class)  //if you comment this out the method will throw exception (fail).
    public void testDivisionWithException()    {
        int x = 1 / 0;
    }
}
