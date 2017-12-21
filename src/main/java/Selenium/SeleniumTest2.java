package Selenium;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
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
//        assertThat(url2, is("http:www.yahoo.com")); //figure this out??????????????????????
        Assert.assertEquals(x,(2));
//        assertThat(x,is(1));     //this doesn't work!!!!!!
    }


    @Test   ///this is in #3
    public void desiredProperties() throws IOException, InterruptedException {

        System.setProperty("webdriver.gecko.driver","c://DriversForSelenium//Geckodriver.exe");

        Map capabilitiesMap = new HashMap();
        capabilitiesMap.put("takeScreenShot", true);

        DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.get("http://www.bing.com");
        sleep(5000);
        File fileName = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(fileName, new File("c:\\tmp\\screenshot.png"));
        System.out.println(fileName.getAbsolutePath());
        //********************************************************************************************************
        try {
            FileUtils.copyFile(fileName, new File("c:\\tmp\\screenshot.png"));
        }
        catch(IOException e)
        {
            System.out.println("ERROR");
        }
        //*******************************************************************************************************

//        Assert.assertEquals(fileName,"c:\\tmp\\screenshot.png");//this fails because the entire string comparison fails.
        sleep(5000);
        driver.close();

    }
}
