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

            new Random().nextBytes(b);
            System.out.println(b);

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

    @Test
    public void between()   {
        Random gen = new Random();

        int min = 15;
        int max = 20;
        for (int i = 0; i <= 1000; i++) {
        //remember: .nextInt(int num) num is exclusive
        int random = gen.nextInt(max - min + 1) + min;
        System.out.println(random);
        }
    }

    //*************************************Gaussian Shit****************************************************************
    @Test
    public void gaussinShit()   {
        Random generate = new Random();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 1; i <= 1000; i++) {
            double gausseShit = generate.nextGaussian();
            System.out.println(gausseShit);
            if (gausseShit> -1.0d&&gausseShit<1.0d)
                count1++;
            if (gausseShit> -2.0d&&gausseShit<2.0d)
                count2++;
            if (gausseShit> -3.0d&&gausseShit<3.0d)
                count3++;
            if (gausseShit> -4.0d&&gausseShit<4.0d)
                count4++;

        }
        System.out.println("About 70% one standard deviation = " + count1/1000f * 100f);
        System.out.println("About 95% two standard deviation = " + count2/1000f * 100f);
        System.out.println("About 99% three standard deviation = " + count3/1000f * 100f);
        System.out.println("About 99.9% four standard deviation = " + count4/1000f * 100f);
    }

    @Test
    public void ages()  {
        Random generate = new Random();

        int min = 30;
        int max = 40;
        int count34 = 0;
        int count35 = 0;
        int age = 0;

        for(int i= 0; i <= 1000; i++)   {
            age = (int)(generate.nextGaussian() * 5) + 35;
            if(age >=min&&age<=max)
                age = age;
            if (age == 34)
                count34++;
            if (age == 35)
                count35++;
        }
        System.out.println("34 : " + count34);
        System.out.println("35 : " + count35);

        assertThat(age>=30&&age<=40,is(true));
    }

    @Test
    public void seed()  {

        long seed = 1234567L;
        int num = 0;
        long numL = 0;
        double numD = 0;

        Random generate = new Random(seed);

        System.out.println(num = generate.nextInt());
        System.out.println(numL = generate.nextLong());
        System.out.println(numD = generate.nextDouble());


    }

    @Test
    public void randomStrings() {
        Random generate = new Random();
        StringBuilder newString = new StringBuilder();
        String randomString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        for(int i = 0; i <=100; i++)    {
        int randomIndex = generate.nextInt(randomString.length());
        char randomChar = randomString.charAt(randomIndex);
        System.out.print(randomChar);
        newString.append(randomChar);
        }
        System.out.println("\n" + newString);
    }


} // end of Test16
