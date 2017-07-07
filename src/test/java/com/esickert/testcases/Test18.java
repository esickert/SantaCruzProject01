package com.esickert.testcases;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.getProperties;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.File;
import java.util.*;

/**
 * Created by esickert on 7/4/2017.
 */
public class Test18 {


@Test
    public void firstPropertyTest() {

        Properties prop = new Properties();
        assertThat(prop.size(), is(0));

        prop.setProperty("browser","chrome");
        prop.setProperty("port","8080");

        assertThat(prop.getProperty("port"), is(("8080")));
        assertThat(prop.getProperty("browser"), is("chrome"));

        System.out.println(prop.getProperty("default"));

        for(String keys: prop.stringPropertyNames())
            System.out.println("Key: " + keys + ", " + "Value: " + prop.getProperty(keys));

        System.out.println("The size of this properties is: " + prop.size());

        System.out.println(prop.getProperty("browser"));
        prop.list(System.out);

    }// end of firstPropertyTest

    @Test
    public void testExercisePage275()   {

        Properties me = new Properties();
        me.setProperty("name", "bob");
        me.setProperty("gender","male");
        me.setProperty("password","Claude111");

        assertThat(me.size(), is(3));

        for(String keys:me.stringPropertyNames())
            System.out.println("Keys: " + keys + " " + "Value: " + me.getProperty(keys));

        me.list(System.out);
        assertThat(me.containsKey("gender"), is(true));
        assertThat(me.getProperty("name"), is("bob"));

        assertThat(me.getProperty("missing", "default"), is("default"));
        assertThat(me.getProperty("permission", "isNULL"), is("isNULL"));
    }  //end of tesdtExercisePage275

    @Test
    public void systemProperties() {

        System.out.println(System.getProperty("user.dir"));
        System.out.println();
        Properties system = getProperties();
        system.list(System.out);

        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("java.io.tmpdir"));
        System.out.println(System.getProperty("line.separator"));
    }

    @Test
        public void getChromeStuff()    {
            //this is just playing with System.getProperty();
            System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("file:///C:/Temp/alerts.html");
    }

    @Test
    public void saveToFileStuff()  {
        Properties sys = System.getProperties();
//    sys.list(System.out);
        System.out.println(System.getProperty("java.io.tmpdir"));
        System.out.println();

//the following is the authors shit which he doesn't explain to write to a file.
        String tempDirectory = System.getProperty("java.io.tmpdir");
        String tempResourceFilePath = new File(tempDirectory,"tempFieForPropertiesStoreTest.properties").getAbsolutePath();

        Properties savedStuff = new Properties();
        savedStuff.setProperty("propertyOne", "Hello Fuck");
        savedStuff.setProperty("propertyTwo", "Explain it next time shit!!");

        savedStuff.list(System.out);

//    FileOutputStream outputFile = new FileOutputStream(tempResourceFilePath);
//    savedStuff.store(savedStuff,"He is reallyFucked Up");
//this is really fucked up!!!!!

    }

}  //end of Test18

