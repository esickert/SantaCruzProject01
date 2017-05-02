package com.esickert.chap011exceptions.examples;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.*;

/**
 * Created by esickert on 5/1/2017.
 */
public class ExceptionsExampleTest {

    @Test
    public void throwNullPointerException() {
        Integer age = null;  //note the class Integer, not primitive int. You can call methods on Integer.
        String ageAsString = age.toString();  //toString is a method

        String myAge = "You are " + ageAsString + " tyears old.";

        assertEquals("You are 18 years  old", myAge);
    }

    @Test
    public void exceptionDemo() {

  //      Scanner userInput = new Scanner(System.in);
 //       System.out.println("Enter thw number of donuts: ");
 //       int donutCount = userInput.nextInt();
        int donutCount = 3;

  //      System.out.println("Enter the number of glasses of milk: ");
 //       int glassesOfMilk = userInput.nextInt();
        int glassesOfMilk = 0;

        double donutsPerGlass = donutCount / (double)glassesOfMilk;
        System.out.println( donutCount + " donuts");
        System.out.println(glassesOfMilk + " glasses of milk.");
        System.out.println("You hve " + donutsPerGlass + " donuts for each glass of milk.");
    }

}//end of ExceptionExampleTest
