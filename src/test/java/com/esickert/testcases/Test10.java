package com.esickert.testcases;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertNotEquals;
//import java.util.Arrays;
import java.util.*;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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
    public void forEach()   {
        //this is weird WEIRD!!!!!!!!!!
        String[] someDays = {"tuesday", "Thursday",
                             "Wednesday", "Monday",
                             "Saturday", "Sunday",
                             "friday"};

        List<String> week = Arrays.asList(someDays);  //this is different syntax. NOTE no keyword 'new'.

        int index = 0;
        for(String temp: week)  {
            if (temp.equals("Monday"))   {
                System.out.println("Monday is at index " + index);
                break;
            }
            index++;
        }
        assertEquals("Monday is at index 3",3, index);



    } //end of loopityLoop

    @Test
    public void whileLoop()  {

        String[] someDays = {"tuesday", "Thursday",
                "Wednesday", "Monday",
                "Saturday", "Sunday",
                "friday"};

        String day = "friday";

        List<String> week = Arrays.asList(someDays);  //this is different syntax. NOTE no keyword 'new'.

        int index = 0;
        while ( !(week.get(index).equals(day))) {
 //           System.out.println(index);
            index++;
        }
        System.out.println(day + " is at index " + index);
        assertEquals("index should be:", 5, index);
    }

    @Test
    public void doWhile()   {
    //this is my solution, not the authors!!!!!

        String[] someDays = {"tuesday", "Thursday",
                "Wednesday", "Monday",
                "Saturday", "Sunday",
                "friday"};

        List<String> week = Arrays.asList(someDays);  //this is different syntax. NOTE no keyword 'new'

        String day = "friday";
        int index = 0;

        do  {
            if ((week.get(index).equals(day)))   {
                System.out.println(week.get(index) + " is at index " + index);
                break;
            }
            index++;
        } while (week.size() > index);

        assertEquals("epected index", 6, index); //index -1 because
    }// end of doWhile

    @Test
    public void assign1Chap10Page146() throws Exception  {

        String[] someDays = {"tuesday", "Thursday",
                "Wednesday", "Monday",
                "Saturday", "Sunday",
                "friday", "me"};

        List<String> week = Arrays.asList(someDays);  //this is different syntax. NOTE no keyword 'new'
        int counter = 0;
        while (week.size()> counter)    {
            System.out.println(week.get(counter));
            counter++;  // don't forget to increment the counter dumbshit
        }
        sleep(5000);
        System.out.println();
        for(int i = 0; week.size() > i; i++)    {
            System.out.print(week.get(i) + " ");
        }
        System.out.println();
        sleep(5000);
        for(String temp: week)  {
            System.out.print(temp + " ");
        }

        assertNotEquals(week, "[tuesday, Thursday, Wednesday, Monday, Saturday, Sunday, friday, me]" );
        assertThat(week,is((week)));  //playing with different asserts.
    } //end of assign1Chap10Page146

    @Test
    public void playingInterfaces() {

    }

}  //end of Test10
