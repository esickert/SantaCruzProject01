package com.esickert.testcases;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

import java.util.*;



/**
 * Created by esickert on 6/13/2017.
 */
public class Test16 {

    @Test
    public void randomData()    {
        System.out.println("Just fucking around with random data");

        double rnd = Math.random();

        System.out.println(String.format("genetrate %f as a random number",rnd));
        assertThat(rnd < 1.0d, is(true));
        assertThat(rnd >= 0.0d, is(true));
    }

    @Test
    public void javaUtilRandom()    {
        Random rnd = new Random();

        boolean randomBoolean = rnd.nextBoolean();
        System.out.println(randomBoolean);
        System.out.println(rnd.nextInt());
    }

    @Test
    public void nextInt() {

        Random rnd = new Random();

        for(int i = 0; i <= 1000; i++)  {
            int rndNum = rnd.nextInt();
            System.out.println(rndNum);
            assertThat(rndNum > Integer.MIN_VALUE, is(true));
            assertThat(rndNum < Integer.MAX_VALUE, is(true));
        }
    }

    @Test
    public void nextBoolean()   {
        Random rnd = new Random();
        int count = 0;

        for(int i = 1; i <= 1000; i++)   {
            Boolean james = rnd.nextBoolean();
            System.out.println(james);
            if (james == true)  {
                assertThat(james, is(true));
                count++;
                System.out.println(james);
            }
            else    {
                assertThat(james, is(false));
                count++;
                System.out.println(james);
            }
        }
        System.out.println(count);
    }

    @Test
    public void nextLong()  {
        Random rnd = new Random();

        for(int i = 0; i <= 1000; i++)  {
            long james = rnd.nextLong();
            System.out.println(james);
            assertThat(james  > Long.MIN_VALUE, is(true));
            assertThat(james < Long.MAX_VALUE, is(true));
        }
    }

    @Test
    public void nextFloat()  {
        Random rnd = new Random();

        for(int i = 0; i <= 1000; i++)  {
            float james = rnd.nextFloat();
            System.out.println(james);
            assertThat(james  > Float.MIN_VALUE, is(true));
            assertThat(james < Float.MAX_VALUE, is(true));
        }
    }

    @Test
    public void nextDouble()  {
        Random rnd = new Random();

        for(int i = 0; i <= 1000; i++)  {
            double james = rnd.nextFloat();
            System.out.println(james);
            assertThat(james  > Double.MIN_VALUE, is(true));
            assertThat(james < Double.MAX_VALUE, is(true));
        }
    }

    @Test
    public void nextBytes()  {
        //NOTE I DONT UNDERSTAND THIS!!!!!!!!!!!!!!!!***************************************
        byte[] b = new byte[20];  //THIS DOESN'T WORK!!!!
        for(byte temp: b)   {
            new Random().nextBytes(b);
            System.out.println(b);
        }
    }

    @Test
    public void nextIntWithBound() {

        Random rnd = new Random();
        int bound = 20;

        for(int i = 0; i <= 1000; i++)  {
            int rndNum = rnd.nextInt(bound);
            System.out.println(rndNum);
            assertThat(rndNum >= 0, is(true));
            assertThat(rndNum <= (bound-1), is(true));
        }
    }

} // end of Test16
