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

    @Test //(expected = NullPointerException.class)
    public void exceptionHandling()  {
        Integer age = null;  //note the class Integer, not primitive int. You can call methods on Integer.

        try {
//        age = 18;
        String myAge = age.toString();  //toString is a method   //this is the line where the code failed with the "null" value


        } catch (NullPointerException x)    {  //since there is no arithmeticException the program still throws a nullpointerex.
            age = 17;  //NOTE: this will cause an excetion to occur with junit
            System.out.println("getMessage - " + x.getMessage());
            System.out.println("getStackTrace - " + x.getStackTrace());
            System.out.println("printStackTrace");
            x.printStackTrace();

       } finally{ // end 0f try-catch the following values must be outsiide the try-catch block

        String ageAsString = age.toString();  //you are not printing out here...no print statement!!!!
        String myAge = "You are " + ageAsString + " years old.";
//       System.out.println(myAge);
    }
        String ageAsString = age.toString();  //you are not printing out here...no print statement!!!!
        String myAge = "You are " + ageAsString + " years old.";


        assertEquals("You are 17 years old.", myAge);
    }


}//end of ExceptionExampleTest
