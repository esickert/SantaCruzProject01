package com.esickert.testcases;

import org.junit.Rule;
import org.junit.Test;

import static java.lang.Integer.parseInt;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertEquals;

import org.junit.rules.ErrorCollector;
import org.testng.asserts.SoftAssert;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

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
    construct.append("HELP ME, Im trapped inside!!!!!");
    assertTrue( construct.capacity() > 16);
    System.out.println(construct);
    }

    //******************************************************************************************************************
    //FOR JOB INTERVIEWS, SAMPLE CODE QUESTIONS.
    //for the fuckhead at the wifi company for automation interview.
    // FIND THE NUMBER OF BITS THAT ARE SWITCHED ON
    @Test
    public void stringOfBits()    {
        String bits = "1001000011110100001110";
        String[] arrayOfBits= bits.split("");
        int count = 0;

        for (String temp: arrayOfBits) {
            System.out.print(temp);
            if (temp.equals("1"))
                count++;
        }
        System.out.println();
        System.out.println("The number \"on\" bits is : " + count);
        }



    //for the shithead at collinear networks. i could do it!!!!!!!!!!!!!!!!!!
    // WRITE CODE THAT GENERATES 300 ASSENDING IP ADDRESSES STARTING AT A SPECIFIC ONE
    @Test
    public void ipAddress() throws NumberFormatException  {
//THERE IS A BUG HERE
        String address = "15.2.233.12";
        String ipArray[] = address.split("\\.");  // JAVA SPLIT USES REGEX SO NEED ESCAPE FOR ".", eg: \\.
//        System.out.println(ipArray[0]);
        int z = parseInt(ipArray[3]);
        System.out.println(z);

        int y = parseInt(ipArray[2]);
        System.out.println(y);

        int x = parseInt(ipArray[1]);
        System.out.println(x);

        int w = parseInt(ipArray[0]);
        System.out.println(w);

        String ipAddress = w + "." + x + "." + y + "." + z;
        System.out.println(ipAddress);

        int count = 1;
            do   {         //i think there is a bug here!!
                if ( z < 255)  {
                    z++;
                    System.out.println(count + "." + " " + w + "." + x + "." + y + "." + z);
                } else if ( y < 255)   {
                    y++;
                    System.out.println(count + "." + " " + w + "." + x + "." + y + "." + z);
                } else if ( x < 255)   {
                    x++;
                    System.out.println(count + "." + " " + w + "." + x + "." + y + "." + z);
                } else if ( w < 255)   {
                    w++;
                    System.out.println(count + "." + " " + w + "." + x + "." + y + "." + z);
                }

            count++;
            } while (count <= 300);

        assertEquals("they are not equal!!!", address, ipAddress);

    //***************************************END OF JOB INTERVIEW QUESTIONS*********************************************

    }

    @Test
    public void replacingStrings()  {

        String hello = "Hello fella fella";

        hello = hello.replaceAll("fella","DOG");
        System.out.println(hello);
        assertThat(hello.replace("fella", "DOG"), is("Hello DOG DOG"));
        hello = hello.replace("DOG", "CAT");
        System.out.println(hello);
    }

    @Test
    public void usingSplit()    {

        String address =  "192.168.2.1";
        String[] ipAddress = address.split(Pattern.quote("."));
        for(String temp: ipAddress) {
            System.out.print(temp + " ");
        }
    }
}   //end of Test15
