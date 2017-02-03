package com.esickert.testcases;

import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;
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
    assertEquals(10.0F,lowed,0);                // I don't understand this notation.
    assertEquals("bob",$aString);

    }

    public int sum(int x, int y)   {

    return x + y;
    }
}