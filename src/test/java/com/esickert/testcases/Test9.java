package com.esickert.testcases;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by esickert on 2/20/2017.
 */
public class Test9 {

    @Test
    public void simpleArray()   {

        String[] numbers = {"zero", "one", "two", "three"};

        for(String numbersText: numbers)    {   // this is new for me
            System.out.print(numbersText + " ");
        }

        assertEquals("one", numbers[1]);
        assertEquals("three", numbers[3]);
    }

}
