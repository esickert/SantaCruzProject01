package com.esickert.testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

/**
 * Created by esickert on 5/1/2017.
 */
public class Test11 {

@Test
public void Chap11Test() throws InterruptedException {

    WebDriver driver = new FirefoxDriver();
    driver.get("http:www.google.com");
    WebElement stuff = driver.findElement(By.className("gb_P"));
    stuff.click();
    sleep(5000);  //sleep throws a checked exception for some reason. While asleep the sleep method can recive an interrupt which will cause it to throw an exception???
    driver.close();
    }

@Test

public void needMilk()  {

    int glassesOfMilk = 2;
    String temp = null;

//    System.exit(0);

    try {
        if (glassesOfMilk < 3)
 //           throw new Exception("Exception: Need more fucking milk!!");  //this is the  throw statement!!!!
            throw new NeedMoreMilkException();
        else
            System.out.println("This is the end");
    } catch(NeedMoreMilkException moreMilk)    {  //NeedMoreMilkException is a user defined Exception class
        System.out.println(moreMilk.getMessage());
        temp = moreMilk.getMessage();
        System.out.println("Help!!I need more MILK");
    }

    assertEquals("ore MILK- separate user-defined exception class", temp); //throwing an exception
}
}  //end of Chap11Test
