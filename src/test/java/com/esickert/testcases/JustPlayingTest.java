package com.esickert.testcases;

import com.esickert.cases.JustPlaying;

import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;                          //NOTE: these are different!! One plural
import org.openqa.selenium.interactions.Actions;

import static com.esickert.cases.Sleep.toSleep;
import static java.lang.Thread.sleep;
//import static javax.swing.text.html.CSS.getAttribute;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;



//import static org.junit.*;

/**
 * Created by esickert on 1/15/2017.
 */
public class JustPlayingTest  {

    private final static int number = 7;                           //remember this !!!!!!!!!!!!!!!!!!
    private static final double aVariable = 8.00;
    private static final boolean truthy = true;
    private static final boolean falsey = false;

 //   @Ignore
    @Test
    public void checkIfEqual()  {
        final int num = 5;
        String password = "hello";
        System.out.println("Need to play with this");
       Assert.assertEquals("Lets see if this works", 5, num);
       assertEquals("hope this works", password, JustPlaying.getPassword());
       System.out.println(JustPlaying.getPassword());  //if the above test fails, the other test cases will not be executed
       assertTrue("is this false", 1==1);
    } //end of checkIfEqual

//**********************************************************************************************************************
//    @Ignore
    @Test
        public void letUsPlay()  throws Exception {
           String temp = "9";
           System.out.println("This is a double = " + aVariable);
           System.out.println("Use this case for selenium");
           WebDriver driver = new FirefoxDriver();
           driver.get("file:///C:/Users/esickert/Desktop/HTML/Selectable.html");
           //use intellij to code the selenium features.

           WebElement ten = driver.findElement(By.name("ten"));
           WebElement eight = driver.findElement(By.name("eight"));
           WebElement six = driver.findElement(By.name("six"));
           //Add all the actions into the Actions builder.
           int time = 0;
           Actions buildMe = new Actions(driver); //a new class
           buildMe.keyDown(Keys.CONTROL)     //okay this is weird!!!!!
                .click(ten)
                .click(eight)
                .click(six)
                .keyUp(Keys.CONTROL);
            //generate the composite action.
            Action compositeAction = buildMe.build();
            // Perforn the composite action.
            compositeAction.perform();
//            toSleep();
           sleep(5000);
           driver.close();

        assertTrue("9", temp.equals("9"));  //not sure why i included this
        } //end of letUsPlaySelenium
//**********************************************************************************************************************
//        @Ignore
        @Test
        public void anotherTest() throws Exception {  //using "throws Exception" for toSleep()  THIS DOES'T WORK   GECKO DRIVER//        System.setProperty("webdriver.gecko.driver","\\Temp\\geckodriver.exe");
        WebDriver erich = new FirefoxDriver();
        erich.get("http://www.google.com");

        WebElement settings = erich.findElement(By.id("fsettl")); //settings
        WebElement button = erich.findElement(By.id("advsl"));  //advance search
        //  the following generates the composite action.
        Actions builder = new Actions(erich);  //erich is a instance of firefox webdriver
            builder.click(settings)
                   .click(button);
        builder.perform();
        toSleep();

        WebElement rick = erich.findElement(By.xpath("html/body/div[1]/div[4]/form/div[2]/div[2]/div[2]/div/input"));
        rick.sendKeys("meru networks");

        System.out.println("This is the text " + rick.getText());
        System.out.println("This worked!!!!...YEAH");
       toSleep();
        System.out.println("This is what's in the box: " + rick.getAttribute("value"));
        assertEquals("check the contents of textbox","meru networks",rick.getAttribute("value")); //This now works.
        WebElement claude = erich.findElement(By.xpath("html/body/div[1]/div[4]/form/div[5]/div[9]/div[2]/input"));
        claude.click();
        toSleep();
        erich.close();
        }

//      @Ignore
      @Test
        public void chapEightStuff() throws Exception   {

        String url =  "www.google.com";
        assertFalse("http://www.google.com", url.equals("http://www.google.cm"));
          System.setProperty("webdriver.chrome.driver","\\Temp\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url2 = addHttp(url);
        driver.get(url2);
        assertFalse("checking urls??", url.equals(url2));          //  ************************************ ERROR ERROR
        //this was experimenting with printing out text in web elements.
        WebElement me = driver.findElement(By.name("btnK"));
        me.sendKeys("will this work");
        String txt = me.getText();
        System.out.println(txt);
        System.out.println(me.getAttribute("value"));
        toSleep();  //sleeps for 5 secs
        driver.close();
        }  //end of method chapEightStuff()

        public String addHttp(String a)    {
            String front = "http://";
            return front + a;
        }  //end of method addHttp

//        @Ignore
        @Test
        public void chapEightMoreStuff01() throws Exception {

            System.out.println("Various Chap 8 Test Cases... ");

        System.out.println("Testing with chrome 56 ...");
        System.setProperty("webdriver.chrome.driver","\\Temp\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.yahoo.com");
      //  DOESN'T WORK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      //  WebElement erich = driver.findElement(By.class("Fz(14px) Fw(b) C(#4d00ae)")));
       // Actions stuff = new Actions(erich);
 //       erich.click();
        toSleep();
        driver.close();
        }

        @Test
        public void chapEightPage45() throws Exception   {
            System.out.println("Same code as above but condensed perform() internally calls build().");

            System.setProperty("webdriver.chrome.driver","\\Temp\\chromedriver.exe");
            ChromeDriver driver2 = new ChromeDriver();
            driver2.get("file:///C:/Users/esickert/Desktop/HTML/Selectable.html");

            WebElement ten = driver2.findElement(By.name("ten"));
            WebElement eight = driver2.findElement(By.name("eight"));
            WebElement six = driver2.findElement(By.name("six"));
            //Add all the actions into the Actions builder.
            int time = 0;
            Actions buildMe = new Actions(driver2); //a new class
            buildMe.keyDown(Keys.CONTROL)     //okay this is weird!!!!!
                    .click(ten)
                    .click(eight)
                    .click(six)
                    .keyUp(Keys.CONTROL);
            buildMe.perform();
            sleep(5000);
            driver2.close();
        }

        @Test
        public void nestedIfElseHorrorPage116()    {   //this is kind of funky!!!

            if (!truthy)  {
                if (falsey)  {
                    if (truthy && !falsey)
                        if (falsey || truthy)
                        System.out.println("line 186");
                            assertTrue((truthy) && (!falsey));   //this is weird, not sure about this!!!!
                }
                else
                    {
                    System.out.println("line 189");
                    assertTrue(truthy);
                    assertTrue("Is this true???", falsey);
                    }
                }
            else   {
                if (truthy) {
                    if (!falsey)
                    {
                        assertTrue("line 200",!falsey);
                        assertFalse("line 201",!truthy);
                    }
                else
                    {
                    assertFalse("line 205", falsey);
                   assertTrue("line 206", truthy);
                    }
                }
            }
//           assertThat(("hello").isIn("hello","World"));
        }

        @Test
        public void trueElsFalsePage113()   {
            if (truthy)
                assertTrue("line 221",!truthy);
            else
                assertFalse("Line 223",truthy);
//            }

            if (truthy)
                assertTrue(truthy);
            else
                assertFalse(truthy);
        }

        @Test
        public void switchExamplePage117()  {
            assertEquals("mr is a male","M", likelyGenderIs("madam"));
            assertEquals("M", likelyGenderIs("mr"));
            assertEquals("M", likelyGenderIs("master"));
            assertEquals("F", likelyGenderIs("miss"));
            assertEquals("F", likelyGenderIs("ms"));
            assertEquals("F", likelyGenderIs("lady"));
            assertEquals("F",  likelyGenderIs("madam"));
        }

        public String likelyGenderIs(String title)  {
            String likelyGender;

            switch(title.toLowerCase()) {
                case "sir":
                    likelyGender = "M";
                    System.out.println("'sir' is a male");
                    break;
                case "mr":
                    likelyGender = "M";
                    break;
                case "master":
                    likelyGender = "M";
                    break;
                default:
                    likelyGender = "F";
                    break;
          }
          return likelyGender;
        } //end of likelyGenderIs



    @Test
    public void switchOnShortCode() {
        assertEquals("United Kingdom", longCodeIs("UK"));
 //       assertEquals("United States", longCodeIs("US"));
    }

    public String longCodeIs(String name) {
        String countryName = "0";

        switch(name)  {
            case "UK":
                countryName = "United Kingdom";

            default:
                break;
        }
        return countryName;
    } //end of longCodeIs


//**********************************************************************************************************************
    @Test
    public void switchOnIntegers()  {
        assertEquals("too small", returnNumber(0));
        assertEquals("one", returnNumber(1));
        assertEquals("two", returnNumber(2));
        assertEquals( "three", returnNumber(3));
        assertEquals("four", returnNumber(4));
        assertEquals("too big", returnNumber(5));
    }

    public String returnNumber(int number) {

        switch(number)  {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            default:
                if (number> 4)
                    return "too big";
                else
                    return "too small";
        }

    } //end of returnNumber
} //end of JustPlayingTest
