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



}
