package com.esickert.testcases;

import com.esickert.cases.JustPlaying;

import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;                          //NOTE: these are different!! One plural
import org.openqa.selenium.interactions.Actions;

import static com.esickert.cases.Sleep.toSleep;
import static javax.swing.text.html.CSS.getAttribute;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


//import static org.junit.*;

/**
 * Created by esickert on 1/15/2017.
 */
public class JustPlayingTest {

    private final static int number = 7;                           //remember this !!!!!!!!!!!!!!!!!!
    private static final double aVariable = 8.00;

    @Ignore
    @Test
    public void checkIfEqual()  {
        final int num = 5;
        String password = "hello";
//        SoftAssertions softly = new SoftAssertions();

       System.out.println("Need to play with this");
 //      Assert.assertEquals("Lets see if this works", 5, num);
       assertEquals("hope this works", password, JustPlaying.getPassword());
       System.out.println(JustPlaying.getPassword());  //if the above test fails, the other test cases will not be executed
       assertTrue("is this false", 2==1);
    } //end of checkIfEqual


    @Ignore
    @Test
        public void letUsPlay()  throws Exception {
           String temp;
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
     //           .wait()
                .click(six)
                .keyUp(Keys.CONTROL);
            //generate the composite action.
            Action compositeAction = buildMe.build();
            // Perforn the composite action.
            compositeAction.perform();
 //           toSleep();
 //          sleep(5000);  //note: this will throw an exception which is passed as per line 43
           driver.close();

        assertEquals("9", temp = "9");
        } //end of letUsPlaySelenium

        @Ignore
        @Test
        public void anotherTest() throws Exception {  //using "throws Exception" for toSleep()
        WebDriver erich = new FirefoxDriver();
        erich.get("http://www.google.com");

        WebElement settings = erich.findElement(By.id("fsettl")); //settings
        WebElement button = erich.findElement(By.id("advsl"));  //advance search
        //  the following generates the composite action.
        Actions builder = new Actions(erich);  //erich is a instance of firefox webdriver
            builder.click(settings)
                   .click(button);
        builder.perform();
//        toSleep();

        WebElement rick = erich.findElement(By.xpath("html/body/div[1]/div[4]/form/div[2]/div[2]/div[2]/div/input"));
        rick.sendKeys("meru networks");

        System.out.println("This is the text " + rick.getText());
        System.out.println("This worked!!!!...YEAH");
        toSleep();
        System.out.println("This is what's in the box: " + rick.getAttribute("value"));
        assertEquals("check the contents of textbox","meru networks",rick.getAttribute("value")); //This now works.
        WebElement claude = erich.findElement(By.xpath("html/body/div[1]/div[4]/form/div[5]/div[9]/div[2]/input"));
        claude.click();
        erich.close();
        }

        @Test
        public void chapEightStuff() throws Exception   {

        String url =  "www.google.com";
        assertFalse("http://www.google.com", url.equals("http://www.google.cm"));
        WebDriver driver = new FirefoxDriver();
        String url2 = addHttp(url);
        driver.get(url2);
        //this was experimenting with printing out text in web elements.
        WebElement me = driver.findElement(By.name("btnK"));
//        me.sendKeys("will this work");
//        String txt = me.getText();
//        System.out.println(txt);
        System.out.println(me.getAttribute("value"));
        toSleep();  //sleeps for 5 secs
        driver.close();
        }  //end of method chapEightStuff()

        public String addHttp(String a)    {
            String front = "http://";
            return front + a;
        }  //end of method addHttp
} //end of class JustPlayingTest()
