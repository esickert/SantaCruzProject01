package com.esickert.testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;


public class SeleniumTest2 {

    @Test
    public void chromeTest() {
        //memorize this and firefox too!!
        System.setProperty("webdriver.chrome.driver","C://DriversForSelenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.bing.com");
    }

    @Test
    public void firefoxTest()   {

        int x = 2;
        System.setProperty("webdriver.gecko.driver","C://DriversForSelenium//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        String url2 = "http:www.yahoo.com";

        driver.get("http:www.yahoo.com");

        Assert.assertEquals(url2,("http:www.yahoo.com"));
//        assertThat(url2, is("http:www.yahoo.com")) figure this out?????????????????????????????????????
        Assert.assertEquals(x,(3));
    }
}
