package com.esickert.testcases;

import org.junit.Test;

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

    String user = "mars";
    String newUser = user + System.currentTimeMillis();
    String noNumUser = newUser;
    System.out.println(newUser);
    System.out.println(noNumUser);

}



}
