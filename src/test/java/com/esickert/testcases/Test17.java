package com.esickert.testcases;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import static java.util.Calendar.*;

import static jdk.nashorn.internal.parser.DateParser.DAY;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Created by esickert on 6/20/2017.
 */
public class Test17 {

@Test
public void currentTimeMill()   {

    System.out.println("Current system time since Jan 1, 1970 is: " + System.currentTimeMillis());
    System.out.println(System.nanoTime());
}

    @Test
    public void currentTimeMillis() {

        long startTime, endTime, totalTime;
        System.out.println(startTime = System.currentTimeMillis());

        for(int i = 0; i <= 100; i++)   {
            System.out.println("The start time is " + System.currentTimeMillis());
        }
        System.out.println(endTime= System.currentTimeMillis());
        System.out.println("The end time is :" + System.currentTimeMillis());
        System.out.println("The total time to complete the loops is: " + (endTime - startTime));
    }

@Test
public void nanoTime() {

    long startTime, endTime, totalTime;
    System.out.println(startTime = System.nanoTime());

    for(int i = 0; i <= 10; i++)   {
        System.out.println("The start time is " + System.nanoTime());
    }
    System.out.println(endTime= System.nanoTime());
    System.out.println("The end time is :" + System.nanoTime());
    System.out.println("The total time to complete the loops is: " + (endTime - startTime));
}

@Test
public void uniqueUserNoNumbers()   {
    //ASSIGNMENT 2 IN CHAPTER 17
    Random random = new Random();
    String user = "mars";
    String temp = "";
    String stuff = "ABCDEFGHIJKLMNOPQ";

    for(int i =0; i <= 10; i++) {
        int rndIndex = random.nextInt(stuff.length());
        char rChar = stuff.charAt(rndIndex);
        System.out.print(rChar);
        temp = temp + rChar;
    }
    System.out.print("\n" + user + temp);

    System.out.print("\n" + user + System.currentTimeMillis());

    //...

}

@Test
public void date()  {

    Date date = new Date();
    System.out.println(date);


    SimpleDateFormat x = new SimpleDateFormat();
    x.applyPattern("MM/dd/yyyy");
    System.out.println(x.format(date));
}

@Test
public void calendar()   {
//Calendar is an abstract class!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Note difference below when "insantiating" Calendar!!!!
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.getTime().getTime());

    System.out.println(cal);
    System.out.println(cal.toString());
}

@Test
public void abstractClasses()   {

    Calendar cal = Calendar.getInstance();

    cal.set(Calendar.YEAR,1955);

    System.out.println(cal.get(Calendar.YEAR));
}

@Test
public void playingWithGet()    {

    Date date = new Date();
    Calendar calen  = Calendar.getInstance();
//  NOTE: THIS IS RETURNING THE CURRENT DATE AND TIME.
    String[] monthNames = {"JAN", "FEB", "MAR", "APRIL", "MAY", "JUNE", "JULY", "SEPT", "OCT", "NOV", "DEC"};

    System.out.println("The current year is: " + calen.get(YEAR));
    System.out.println("The current month is: " + monthNames[(calen.get(MONTH))]);
    System.out.println(calen.get(DAY));
    System.out.println("The date is: " + calen.get(DAY_OF_MONTH));
    System.out.println("The current time is: " + calen.get(HOUR) + ":" + calen.get(MINUTE));

    assertThat(calen.get(Calendar.MONTH), is(6));  // remember january is 0, february is 1, etc

}

} //end of Test17
