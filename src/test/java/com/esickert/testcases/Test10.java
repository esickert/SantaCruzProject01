package com.esickert.testcases;

import org.junit.Test;

//import java.util.Arrays;
import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by esickert on 3/13/2017.
 */
public class Test10 {

    @Test public void simpleCollectionEx()  {
        String[] numbers = {"zero", "one", "two", "three"};
        List<String> numbers0123 = Arrays.asList(numbers);     //simple example of collections

        for(String temp:numbers0123)    {
            System.out.println(temp);
        }

        assertEquals("zero", numbers0123.get(0));
//        assertEquals("is two equal to 2???","two", numbers0123.get(3));
        numbers0123.set(0, "one");//in List(index, element);
        System.out.println(numbers0123.get(0) + " line 26"); //******************using set here because add is not allowed as umbers0123 is an array.

        //Note this is jumping right into collections using lists. Here we are doing something that i don't understand.

    } //end of simpleCollections

    @Test
    public void dynamicCollection() {

        List<String> num0123 = new ArrayList<String>();

        num0123.add("zero");
        num0123.add("one");
        num0123.add("two");
        num0123.add("three");

        for(String temp:num0123)    {
            System.out.println(temp + " ");
        }

        assertEquals("two", num0123.get(2));
        assertEquals("three", num0123.get(3));

       List<String> game = new ArrayList<String>();  //List is an interface. Cannot instatiate an interface, only classes can be instantiated.
    }

    @Test
    public void loopityLoop()   {
        //this is weird WEIRD!!!!!!!!!!
        String[] someDays = {"tuesday", "Thursday",
                             "Wednesday", "Monday",
                             "Saturday", "Sunday",
                             "friday"};

        List<String> week = Arrays.asList(someDays);  //this is different syntax. NOTE no keyword 'new'.

/*        int index = 0;
        for(String temp: week)  {
            if (temp.equals("Monday"))   {
                System.out.println("Monday is at index " + index);
                break;
            }
            index++;
        }
        assertEquals("Monday is at index 3",3, index);

        */int index = 0;
        while ( !(week.get(index).equals("Saturday"))) {
            System.out.println(index);
            index++;
        }

    } //end of loopityLoop



}  //end of Test10
