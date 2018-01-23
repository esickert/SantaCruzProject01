package com.selenium;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
//import static org.testng.AssertJUnit.assertEquals;


public class SeleniumTest2 {

    @Test
    public void chromeTest() {
        //memorize this and firefox too!!
        System.setProperty("webdriver.chrome.driver","C://DriversForSelenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.bing.com");
    }

    @Test
    public void firefoxTest() throws Exception {

        int x = 2;
        System.setProperty("webdriver.gecko.driver","C://DriversForSelenium//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        String url2 = "http:www.monster.com";

        driver.get(url2);
        sleep(5000);
        driver.close();

        Assert.assertEquals(url2,("http:www.monster.com"));
//        assertThat(url2, is("http:www.yahoo.com")); //figure this out????????

        Assert.assertEquals(x,(2));
//        assertThat(x,is(1));     //this doesn't work!!!!!!
    }


    @Test   ///this is in #3
    public void desiredProperties() throws IOException, InterruptedException {

//        System.setProperty("webdriver.gecko.driver","c://DriversForSelenium//Geckodriver.exe");

        System.setProperty("webdriver.chrome.driver","C://SeleniumDrivers//chromedriver.exe");


        Map capabilitiesMap = new HashMap();
        capabilitiesMap.put("takeScreenShot", true);
        System.out.println(capabilitiesMap.get("takeScreenShot"));  //this is the key value for capabilitiesMap!!

        DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
//        WebDriver driver = new FirefoxDriver(capabilities);

        WebDriver driver = new ChromeDriver(capabilities);

        driver.get("http://www.bing.com");
        sleep(5000);
        File fileName = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fileName, new File("c:\\tmp\\screenshot.png"));
        System.out.println(fileName.getAbsolutePath());
        //****************************************************************************************************
        try {
            FileUtils.copyFile(fileName, new File("C:\\Users\\esickert\\AppData\\Local\\Temp\\screenshot.png"));
        }
        catch(IOException e)
        {
            System.out.println("ERROR");
        }
        //***************************************************************************************************

        Assert.assertEquals(fileName.getAbsolutePath(),"C:\\tmp\\screenshot.png");    //this fails because the entire string comparison fails.
        sleep(5000);
       driver.close();

//    @Test
//    public void

    }
//**********************************************************************************************************************
    @Test
    //testing if text inside alert button is correct.
    public void handleAlerts() throws Exception {

        System.setProperty("webdriver.gecko.driver", "c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver;

        driver = new FirefoxDriver();

        driver.navigate().to("file:///C:/SeleniumTestPages/SeleniumBookStuff/Alerts.html");
        sleep(5000);

        //finding the location of the button "Click on me"
        WebElement element = driver.findElement(By.xpath("html/body/fieldset/button"));
        element.click();

        //using switchT0() to switch focus on the alert window
        Alert alert = driver.switchTo().alert();

        sleep(3000);

        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().dismiss();

        String expectedMessage = "I am an example for alert box!";
        String actualText = driver.switchTo().alert().getText();

        assertThat(expectedMessage, is(actualText));
//
//       sleep(3000);
        driver.quit();
//        quitDriver(driver);
    }
        //one of the helper webpage did it this way. Not sure why.
        public static void quitDriver(WebDriver driver )  {
            driver.quit();
        }
//**********************************************************************************************************************
    @Test
    public void handlesModalAlerts() {

        System.setProperty("webdriver.gecko.driver", "c://seleniumDrivers//geckodriver.exe");
        WebDriver driver = null;

        //this is not correctly setup
 //       Map setCaps = new HashMap();

        driver = new FirefoxDriver();
        driver.navigate().to("file:///C:/SeleniumTestPages/SeleniumBookStuff/Alerts.html");


//        DesiredCapabilities capabilities = new DesiredCapabilities(setCaps);
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = cap.getBrowserName().toLowerCase();
        System.out.println(browserName);
        String os = cap.getPlatform().toString();

        System.out.println("This is os: " + os);
        String v = cap.getVersion();
        System.out.println("This is version: " + v);


//        WebElement element = driver.findElement(By.xpath("html/body/fieldset/button"));
//        element.click();
    }

}
