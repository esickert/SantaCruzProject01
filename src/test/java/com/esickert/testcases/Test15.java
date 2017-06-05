package com.esickert.testcases;

import org.junit.Rule;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.rules.ErrorCollector;
import org.testng.asserts.SoftAssert;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by esickert on 5/25/2017.
 */
public class Test15 {

    SoftAssert softly = new SoftAssert();

    @Test                                                 //this doesn't do anything!!!!!!!!
    public void justTestingAround() {
//        System.setProperty("webdriver.chrome.driver", "\\DriversForSelenium\\chromedriver.exe");
//      ChromeDriver driver = new ChromeDriver();
//      driver.get("http://www.bing.com");
        System.out.println(" this is \"the\" end \\");
        String intConcatConvert = "" + 1;
        System.out.println(intConcatConvert);
        assertThat(intConcatConvert, is("1"));
        System.out.println(String.valueOf(2.9));
        assertThat(String.valueOf(2.9), is("2.9"));
        assertThat(Integer.valueOf(2), is(2));

        byte[] bArray = "hello World".getBytes();
        System.out.println(bArray);
        assertThat("hello World".getBytes(),is(bArray));
    }//end of justTestingAround

    @Test
    public void constructingStrings()   {

        String one = new String("1234567890");
        assertThat(new String(one), is("1234567890"));

        char[] charArray = {'a', 'b', 'c'};
        assertThat(new String(charArray), is("abc"));   //this is fucking different, creates a String class, converts charArray, then dies.
                                                             // there's no object created.
        byte[] byteArray = "hello".getBytes();
        assertThat(new String(byteArray), is("hello")); //this converts the byte array into the String.

        System.out.println(new String(charArray,0,2));  //cool huh!!!!
        System.out.println(new String(byteArray, 0,3));
    }

    @Test
    public void compareStrings()    {

        String x = "hello";
        assertThat(x.compareTo("hello"), is(0));

        System.out.println(x.compareTo("hd"));
        assertThat(x.compareTo("hellp")<0, is(true));
    }

    @Test
    public void contains()  {

        String x = "doggie in a blue sudan";
        String y = "cattie makes it to rodan";

        assertThat(x.contains("dog"), is(true));
    }

    @Test
    public void contentEquals() {

        String x = "the Good Guys";
        assertThat(x.contentEquals("the Good Guys"), is(x.contains(" ")));
        assertThat(x.contentEquals("the good Guys"), is(false)); //note the case in the words

        StringBuilder sb;
        sb = new StringBuilder("today is the first day");
        assertThat(x.contentEquals(sb), is(not(true)));
    }


//    @Rule
//    public ErrorCollector collector = new ErrorCollector(); //this is funky, collects the errors????? not ure whats going on here???
    @Test
    public void endsWithIsEmpty()   {

        String x = "Hello";
        assertThat(x.endsWith("Hello"), is(true));
        assertThat(x.endsWith("llo"), is(true));

        assertThat(x.startsWith("Hel"), is(true));   //NOTE: startsWith and endsWith are both case sensitive!!!!!`
        assertThat(x.startsWith("Hell"), is(true));

        assertThat(x.isEmpty(), is(false));

//        softly.assertAll();
    }

    @Test
    public void regionMatches()    {

        String x = "hello fella";
        System.out.println(x.regionMatches(true, 9, "young lady", 6, 2));
        assertThat(x.regionMatches(true,9,"young lady",6,2), is(true));
    }

    @Test  //************************************************************************************************************
    public void exerciseFindPositions() {

        List<Integer> positions = new ArrayList<Integer>();
 //       String stuff = "hello fella";
        String stuff = "hello fella";
        int x = 0;

 //       while ( x != -1)

        if (stuff.contains("l") == (false)) {
            throw new NullPointerException("checking if substring in string...NOT...BOOM!!!");
        }
        positions.add(stuff.indexOf("l",0));
        positions.add(stuff.indexOf("l", 3));

        positions.add(stuff.indexOf("l", stuff.indexOf("l",4)));
        positions.add(stuff.indexOf("l", stuff.indexOf("l",9)));
        positions.add(stuff.indexOf("l", stuff.indexOf("l",10)));  //because this returns -1 for index
        positions.add(stuff.indexOf("l",10));

        System.out.println(positions.get(0));
        System.out.println(positions.get(1));
        System.out.println(positions.get(2));
        System.out.println(positions.get(3));
        System.out.println(positions.get(4));
        System.out.println(positions.get(5));
    }

    @Test
    public void letsSplit() {    //USING SPLIT TO CREATE AND ARRAY OF STRINGS

/*        String test = "1 2 3 4 5 6 7 8 9 0";
        String[] results = test.split(" ");
        for(String temp: results) {
            System.out.print(temp + " ");
*/
        String test2 = "abcdefghijk";
        String[] results2 = test2.split("");
        for(String temp2: results2) {
            System.out.print(temp2 + " ");
        }
    }

    @Test
    public void stringBuild()   {

    StringBuilder construct =   new StringBuilder("this is a test of time ");
    System.out.println(construct.capacity());
    construct.append("HELP ME!!");
    assertTrue( construct.capacity() > 16);
    System.out.println(construct);

    }

}   //end of Test15
