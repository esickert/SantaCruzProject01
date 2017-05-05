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
    public void exceptionHandling() {
        Integer age ;  //note the class Integer, not primitive int. You can call methods on Integer.

        try {
        age = 5/0;
        String ageAsString = age.toString();  //toString is a method   //this is the line where the code failed with the "null" value

        } catch (Exception x)    {  //since there is no arithmeticException the program still throws a nullpointerex.
        age = 17;  //NOTE: this will cause an excetion to occur with junit
//        x.printStackTrace();
//       System.out.println(x.getMessage());
//       System.out.println("You fucked up DUDE!!");

       }  // end 0f try-catch the following values must be outsiide the try-catch block

        String ageAsString = age.toString();  //you are not printing out here...no print statement!!!!
        String myAge = "You are " + ageAsString + " years old.";
//       System.out.println(myAge);




        assertEquals("You are 19 years old.", myAge);
    }


}//end of ExceptionExampleTest
