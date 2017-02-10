package com.esickert.testcases;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by esickert on 2/8/2017.
 */
public class Chap8Test {

    @Test                                     //Remember the @Test keyword
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

    public String addHttp(String a)   {
        return "http://" + a;
    }

    @Test
    public void cats()    {

        int numberOfCats = 2;
        String feline;

        feline = (numberOfCats == 1) ? "Cat" : "CATS";
        System.out.println(feline);
    }

    @Test
    public void pussyFoot() {

    assertEquals("2 == cats", "cats" , catOrCats(2));  //interesting way of doing this with a assert statement.
    }

    public String catOrCats(int x) {
        String feline = (x==1 ? "cat" : "cats");
        System.out.println(feline);
        return feline;
    }
}


