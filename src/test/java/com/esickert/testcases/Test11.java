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

}  //end of Chap11Test
