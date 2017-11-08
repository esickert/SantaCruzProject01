package com.esickert.testcases;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
//import static org.hamcrest.core.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

/**
 * Created by esickert on 5/17/2017.
 */
public class Test14 {


    @Test
    public void createJunitTestMethods()    {
        String z = null;
        int x = 7;
        int y = 7;
        int[] anArray = {1,2,3,4,5};
        int[] anotherArray = {1,2,3,4,5};

        assertEquals("This is a test", x, y);
        assertFalse("Is this false?", x == 8);
        assertTrue("Is this false??", y == 7);

        assertArrayEquals("Are arrays equal", anArray, anotherArray);  //assertArrayEquals ********************

        assertNotNull("Is this not null", x);
        assertNotSame("Are they not the same?", z, y);  // assertNotSame
        assertNull("Is this null?", z);
        assertSame("Are they the same??", x , y);
    }

    @Test
    public void assertThatWorks()    {  //NOTE cannot name a method using a reserved word. YES it was recursive!!!!
        String z = null;
        int x = 7;
        int y = 7;
        int[] anArray = {1,2,3,4,5};
        int[] anotherArray = {1,2,3,4,5};

        assertThat("Are they true??", x , is(y));
        Assert.assertThat( "Is not...",x, is(not(8)));
        Assert.assertThat("3 + 3", x, is(x));
        assertThat("Arrays equal...", anArray, is(anotherArray));
        assertThat("are we null", z, is(nullValue()));
 //       assertThat("Are we not equal??",x, not(y));
        assertThat("Is it null??",z, is(nullValue()));
        assertThat(x, is(y));
    }



    @Ignore
    @Test
    public void testingTheFailMethod() {
        fail("Testing the fail method");
    }


}
