package com.esickert.testcases;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by esickert on 2/1/2017.
 * Chapter 7 code examples
 */
public class Chap7Test {

    private static final int CONST = 5;
    private int b = 44;

    @Test
    public void addTwoNumbers() {
  /*  static */final long CONSTANT = 123;       //This is weird!!!
    int a = 5;
    int $b = 6;
    float lowed = 10F;
    String $aString = "bob";

    System.out.println(("Are these equal? " + (sum(a, b) == 11)));    //INCORRECT STATEMENT!!!!!!
    System.out.println(this.b);  //note this returns 44 which is a class field, not local variable
    assertTrue("Are these equal???",sum(a,$b) == 11);
    assertEquals(10.0F, lowed,0);                // I don't understand this notation.
    assertEquals("bob",$aString);

    }

    public int sum(int x, int y)   {

    return x + y;
    }

    @Test
    public void BooleanType()   {     //PAGE 91 JAVA FOR TESTERS
        boolean truth = true;
        boolean falsey = false;
        long bigNum= 900_000_000;  //NOTE can use underscore for readability


        assertTrue(truth);
        assertFalse(falsey);

        //*************************

        truth = Boolean.TRUE;
        falsey = Boolean.FALSE;

        assertTrue(truth);
        assertFalse(falsey);
//        assertFalse(truth);

        System.out.println(bigNum);

     }

     @Test
     public void FloatingPointType() {    //PAGE 97 JAVA FOR TESTERS

     float singlePercision32bit;
     double doublePercision64bit;

     //SoftAssert soft = testCase.getSoftAssert();

     System.out.println("* 'float' range: " +
                            Float.MIN_VALUE + " to " +
                            Float.MAX_VALUE);

     System.out.println("* 'double' range : " +
                            Double.MIN_VALUE + " to " +
                            Double.MAX_VALUE);

     singlePercision32bit = 10.0F; //suffix F to get a float
     assertEquals(10F, singlePercision32bit, 0);

     doublePercision64bit = 20.0;
     assertEquals(20D, doublePercision64bit, 0);  //not suffix D for double

     }

     @Test
     public void ternaryOperatorsExplored() {

        int x;
        x = (4>3) ?  2 : 1;
        System.out.println(x);

        assertEquals(x, 2);

        assertTrue( (5 >= 4) ? true : false);
    }

    @Test
    public void someStringMethods() {

        String stuff = "abcdef";

        System.out.println(stuff.compareToIgnoreCase("ABCDEF") == 0);

        assertEquals(6, stuff.length());
        //note the folowing are assertTrue()
        assertTrue(stuff.compareToIgnoreCase("ABCDEF") == 0);
        assertTrue(stuff.contains("bcde"));
        assertTrue(stuff.startsWith("abc"));

        //string indexing starts at 0 ,assertEqauls()
        assertEquals('c', stuff.charAt(2));
        assertEquals("ef", stuff.substring(4));

    }
}