package com.esickert.testcases;

import com.esickert.cases.JustPlaying;

import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;   //NOTE: these are different!! One plural
import org.openqa.selenium.interactions.Actions;

import static com.esickert.cases.Sleep.toSleep;
import static junit.framework.TestCase.assertTrue;


//import static org.junit.*;

/**
 * Created by esickert on 1/15/2017.
 */
public class JustPlayingTest {

    public static final int number = 7;
    public static final double aVariable = 8;

    @Ignore
    @Test
    public void checkIfEqual()  {
        int num = 5;
        String password = "hello";
//        SoftAssertions softly = new SoftAssertions();

       System.out.println("Need to play with this");
 //      Assert.assertEquals("Lets see if this works", 5, num);
       Assert.assertEquals("hope this works", password, JustPlaying.getPassword());
       System.out.println(JustPlaying.getPassword());  //if the above test fails, the other test cases will not be executed
       assertTrue("is this false", 1==1);
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
                .click(six)
                .keyUp(Keys.CONTROL);
            //generate the composite action.
            Action compositeAction = buildMe.build();
            // Perforn the composite action.
            compositeAction.perform();
            toSleep();
 //          sleep(5000);  //note: this will throw an exception which is passed as per line 43
           driver.close();

        Assert.assertEquals("9", temp = "9");
        } //end of letUsPlaySelenium

        @Test
        public void anotherTest() throws Exception {  //using "throws Exception" for toSleep()
        WebDriver erich = new FirefoxDriver();
        erich.get("http://www.google.com");

        WebElement settings = erich.findElement(By.id("fsettl")); //settings
        WebElement button = erich.findElement(By.id("advsl"));  //advance search
        //  the following generates the composite action.
        Actions builder = new Actions(erich);
            builder.click(settings)
                   .click(button);
        builder.perform();
        toSleep();
//        erich.close();
        }
}
