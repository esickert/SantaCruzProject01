package com.esickert.testcases;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by esickert on 2/8/2017.
 */
public class Chap8Test {

    private static boolean truthy = true;
    private static boolean falsey = false;

    public static String addHttp(String a)   {
        return "http://" + a;
    }

    public String catOrCats(int x) {
        String feline = (x==1 ? "cat" : "cats");
        System.out.println(feline);
        return feline;
    }

    @Test
    public void thisIsForChapter8() {
        System.out.println("This class is for Chapter 8");
        System.out.println((3>2)?"WOW":"SUCKS");  //conditional statement Ternary
    }

    @Test
    public void MoreTernary() {                            //work with this in eclipse

        String url = "www.eviltester.com";

        url = (url.startsWith("http://") ? url : addHttp(url));

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    @Test
    public void cats()    {   //Chapter 8 page 110

        int numberOfCats = 2;
        String feline;

        feline = (numberOfCats == 1) ? "Cat" : "CATS";
        System.out.println("The returned value '" + feline + "'");
    }

    @Test
    public void pussyFoot() {     //Chap 8 page 110

    assertEquals("2 == cats", "cats" , catOrCats(2));  //interesting way of doing this with a assert statement.
    }



    @Test
    public void playTest()  {
    String url = "www.seleniumSimplified.com";

        if ((!url.startsWith("http://"))) {
        url = addHttp(url);
        }
        System.out.println(url);
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumSimplified.com", url);
    }

    @Test
    public void ifStatement()    {

//        boolean truthy = true;

        if (truthy)  //for this to work truthy needs to be true
            TestCase.assertEquals(true, truthy);

        if (truthy) {
            Assert.assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void ifElse()   {

//     truthy = false;

        if (truthy)   //for this to pass truthy needs to be true.
            Assert.assertTrue(truthy);
        else
            assertFalse(truthy);
    }

    @Test
    public void nestedIfElse()    {

        String url = "seleniumsimplified.com";

        if (url.startsWith("http://"))
        ;
        else {
            if (!url.startsWith("www")){    //this is weird for me with the "not" startsWith
                url = "www." + url;
            }
        url = addHttp(url);
        assertEquals("http://www.seleniumsimplified.com", url);
        assertTrue(url.startsWith("http://"));
        }
    }

}


