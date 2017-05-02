package com.esickert.chap011exceptions.examples;

import static org.junit.Assert.assertEquals;
import org.junit.*;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

/**
 * Created by esickert on 5/1/2017.
 */
public class ExceptionsExampleTest {

    @Test
    public void throwNullPointerException() {
        Integer age = 18;  //note the class Integer, not primitive int. You can call methods on Integer.
        String ageAsString = age.toString();  //toString is a method

        String myAge = "You are " + ageAsString + " years old.";



        assertEquals("You are 18 years old.", myAge);
    }

    public static int testUserInput(InputStream in,PrintStream out) {  //this is sa solution for scanner input. not sure how it works
        Scanner keyboard = new Scanner(in);
        out.println("Give a number between 1 and 10");
        int input = keyboard.nextInt();

        while (input < 1 || input > 10) {
            out.println("Wrong number, try again.");
            input = keyboard.nextInt();
        }

        return input;
    }




}//end of ExceptionExampleTest
