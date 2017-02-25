package com.esickert.cases;

/**
 * Created by esickert on 1/15/2017.
 */

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;

 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.interactions.Actions;

 import static org.junit.Assert.assertEquals;
//import org.openqa.selenium.findElement;

public class TheMonster {
    private static String password = "hello";

    public static void main(String[] args)  {
        String url = "http://www.monster.com";


        System.out.println();
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        WebElement erich = driver.findElement(By.xpath("//*[@id=\"mobile-navbar-search\"]/ul/li[1]/a/span[2]"));
        erich.click();
        WebElement eric = driver.findElement(By.xpath("html/body/div[2]/div/nav/div[1]/div[2]/ul/li[1]/ul/li[1]/a"));

        eric.click();
        Actions builder = new Actions(driver);

        assertEquals(url, "http://www.monster.net");



    }


    public static String getPassword() {
        return password;
    }
}
