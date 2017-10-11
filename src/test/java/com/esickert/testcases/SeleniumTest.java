package com.esickert.testcases;

import com.esickert.cases.TheMonster;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;                          //NOTE: these are different!! One plural
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.logging.LoggingPreferences;

import java.awt.*;
import java.awt.event.InputEvent;

import java.awt.event.KeyEvent;
import java.io.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import static com.esickert.cases.Sleep.toSleep;
import static java.lang.Integer.*;

import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import static org.openqa.selenium.By.name;
import static org.openqa.selenium.Keys.ENTER;


//import static org.junit.*;

/**
 * Created by esickert on 1/15/2017.
 */
public class SeleniumTest {

    private final static int number = 7;                           //remember this !!!!!!!!!!!!!!!!!!
    private static final double aVariable = 8.00;
    private static final boolean truthy = true;
    private static final boolean falsey = false;


 //   @Ignore
    @Test
    public void checkIfEqual()  {
        final int num = new Integer("5"); //the wrapper class Integer() converts the String value to an integer automatically.
        String password = "hello";
        System.out.println("Need to play with this");
       Assert.assertEquals("Lets see if this works", 5, num);
       assertEquals("hope this works", password, TheMonster.getPassword());
       System.out.println(TheMonster.getPassword());  //if the above test fails, the other test cases will not be executed
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
           driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/Selectable.html");
           //use intellij to code the selenium features.

           WebElement ten = driver.findElement(name("ten"));
           WebElement eight = driver.findElement(name("eight"));
           WebElement six = driver.findElement(name("six"));
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
        System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
        WebDriver erich = new ChromeDriver(); //chrome driver for chrome web browser.
//        WebDriver erich = new FirefoxDriver();
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
        WebElement me = driver.findElement(name("btnK"));
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
        System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
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

            System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
            ChromeDriver driver2 = new ChromeDriver();
            driver2.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/Selectable.html");

            WebElement ten = driver2.findElement(name("ten"));
            WebElement eight = driver2.findElement(name("eight"));
            WebElement six = driver2.findElement(name("six"));
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
        public void trueElseFalsePage113()   {
            if (truthy)
                assertTrue("line 221",truthy);
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
            assertEquals("mr is a male","M", likelyGenderIs("master"));
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
        assertEquals("United Kingdom", longCodeIs("uk"));
        assertEquals("United States", longCodeIs("US"));
    }

    public String longCodeIs(String name) {
//        String countryName = "0";

        switch(name)  {
            case "uK":
            case "Uk":
            case "uk":
            case "UK":
                return "United Kingdom";
            case "US":
                return "United States";

            default:
                return "WRONG- NOT CORRECT!!!";

        }
//        return countryName;
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
 //       assertEquals("What the ...", returnNumber(MAX_VALUE));
        assertEquals("too small", returnNumber(MIN_VALUE));
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

    @Test
    public void moveByOffSet() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
//    WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/Selectable.html");
        WebElement one = driver.findElement(name("one"));
        System.out.println("X coordinate is: " + (one.getLocation().getX()) + ", Y coordinate is: "
                                  + one.getLocation().getY());
 //   one.click();
        int count = 0;
        Actions builder = new Actions(driver);
        while (count < 10)  {
        builder.moveByOffset((one.getLocation().getX()+200), one.getLocation().getY()+200).click();
        builder.moveByOffset((one.getLocation().getX()-100), one.getLocation().getY()-100).click();
        builder.moveByOffset((one.getLocation().getX()-100), one.getLocation().getY()-100).click();
        builder.perform();
        count++;
        sleep(2000);
        }

        assertEquals(8,one.getLocation().getX());
        assertEquals(8,one.getLocation().getY());
        driver.close();
    }  //end of moveMouseByOffSet

    @Test
    public void moveAndClick() throws Exception {
        int tileWidth = 100;
        int tileHeight = 80;
        int border = 1;

        System.setProperty("webdriver.chrome.driver", "\\DriversForSelenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
//    WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/Selectable.html");
        WebElement one = driver.findElement(name("one"));
//        one.click();
        System.out.println("X coordinate is: " + (one.getLocation().getX()-8) + ", Y coordinate is: "
                + (one.getLocation().getY()-8));
        Actions builder = new Actions(driver);
       builder.moveByOffset((one.getLocation().getX()-8), one.getLocation().getY()-8);
        System.out.println("X coordinate is: " + (one.getLocation().getX()-8) + ", Y coordinate is: "
                + (one.getLocation().getY()-8));
        builder.moveByOffset(320,250);
        builder.click();
        builder.perform();
        sleep(5000);
//******************************************************************************************
//The following uses the ROBOT class to automate the mouse movement----------------------------ROBOT CLASS!!!!!!!!!!!!!
        System.out.println("Move the mouse by class Robot, instance bot");
        Robot bot = new Robot();
        int mask = InputEvent.BUTTON1_MASK;
        bot.mouseMove(100, 280);
        bot.delay(10000);
        System.out.println("click...click..the mouse button!!!!");
        bot.mousePress(mask);
        bot.mouseRelease(mask);
//******************************************************************************************
        sleep(5000);
        driver.close();

    }//end of moveAndClick()

    @Test
    public void diffSyntaxForActions()  throws Exception    {

    System.setProperty("webdriver.chrome.driver", "\\DriversForSelenium\\chromedriver.exe");
    WebDriver driver2 = new ChromeDriver();
    driver2.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/Selectable.html");

    WebElement four = driver2.findElement(name("four"));
    WebElement six = driver2.findElement(name("six"));
    WebElement seven = driver2.findElement(name("seven"));
    WebElement eight = driver2.findElement(name("eight"));
    Actions builder = new Actions(driver2);
        four.click();
        six.click();
        seven.click();
        eight.click();
    builder.perform();
    sleep(5000);
        builder.click(eight).click(four).click(six).click(seven);   //METHOD CALL CHAIN *****************************
    builder.perform();
    driver2.close();
    }  //diffSyntaxForActions

    @Test
    public void clickAndHold() throws Exception {

    System.setProperty("webdriver.chrome.driver", "\\DriversForSelenium\\chromedriver.exe");
    WebDriver driver3 = new ChromeDriver();
    driver3.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/Sortable.html");
    WebElement twelve = driver3.findElement(name("twelve"));
    sleep(5000);
    WebElement two = driver3.findElement(name("two"));
    WebElement three = driver3.findElement(name("three"));
    Actions builder = new Actions(driver3);
    builder.clickAndHold(twelve)
 //      .moveByOffset(8,8)
       .release(two)
       .perform();
    sleep(5000);
    driver3.close();
    }//end of clickAndHold

    @Test
    public void clickAndHold2() throws Exception {

    System.setProperty("webdriver.chrome.driver", "\\DriversForSelenium\\chromedriver.exe");
    WebDriver driver4 = new ChromeDriver();
    driver4.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/Sortable.html");
    WebElement four = driver4.findElement(name("four"));
    WebElement eleven = driver4.findElement(name("eleven"));
    Actions builder = new Actions(driver4);
//    builder.clickAndHold(four).moveByOffset(8,220).release(eleven).perform();  //THIS IS A METHOD CHAIN!!!!
    builder.clickAndHold(four)  //***************************************************************
  //         .moveToElement(eleven).release().perform();  //NEW METHOD "MOVETOELEMENT". NOTE THE SYNTAX OF .PERFORM()
           .moveByOffset(8,220)
           .release(eleven)
           .perform();                                                           //DON'T FORGET .PERFORM SHITHEAD!!!!!
    sleep(5000);
    driver4.close();
    }//end of clickAndHold2

    @Test
    public void moveToElement() throws Exception    {     //PLAY WITH THIS!!!!!!!!!!!!!!!

//        WebDriver driver = new FirefoxDriver();
//        driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/Selectable.html");
        System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/Selectable.html");
        WebElement eleven = driver.findElement(name("eleven"));
        WebElement five = driver.findElement(name("five"));
        Actions builder = new Actions(driver);
        builder.moveToElement(five)   //**********************************************************
            .clickAndHold()
            .release(five)
 //           .clickAndHold();
            .click(eleven)
 //           .release(eleven)
            .perform();    //DON'T FUCKING FORGET TO dot-P-E-R-F-O-R-M THE FUCKING ACTIONS!!!!!
        //   builder.moveToElement(eleven).click();
        sleep(5000);
        driver.close();
    }

    @Test
    public void dragAndDropBy() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/DragMe.html");
        WebElement dragMe = driver.findElement(By.id("draggable"));
        Actions build = new Actions(driver);
        build.dragAndDropBy(dragMe, 300, 8);
        build.perform();   //Dont forget perform mother fucker!!!!.
        sleep(5000);
        driver.close();
    }  //end of

    @Test
    public void dragAndDrop() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/DragAndDrop.html");
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement desc = driver.findElement(By.id("droppable"));
        Actions build = new Actions(driver);
        build.dragAndDrop(src, desc).perform();
        sleep(5000);
        driver.close();
    }

    @Test
    public void doubleClick() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/DoubleClick.html");
        WebElement button = driver.findElement(name("dblClick"));
        Actions build = new Actions(driver);
        build.moveToElement(button).doubleClick().perform();
        sleep(5000);
        /* NOTE there is a javascript popup that also needs to close. Use driver.quit() NOT driver.close()!!!! */
        driver.quit();
    }

    @Test
    public void doubleClickWebElement() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/DoubleClick.html");
        WebElement dblClick = driver.findElement(name("dblClick"));
        Actions build = new Actions(driver);
        build.doubleClick(dblClick).perform();
        sleep(5000);
        driver.quit();
    }

    @Test
    public void contextClick() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/esickert/Desktop/SeleniumHTML/contextClick.html");
        WebElement rightClick = driver.findElement(By.id("div-context"));
        Actions build = new Actions(driver);
        build.contextClick(rightClick).click(driver.findElement(name("Item 3"))).perform();
        sleep(5000);
        driver.quit();  //below will not work because there is a window open
   }

   @Test
   public void rightClick() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        Actions build = new Actions(driver);
        build.moveByOffset(100,200).contextClick().perform();   //NEED TO ADD PERFORM TO ACTIONS STUPID!!!!!!!!!
        //OKAY THIS WORKED Just opened in the web frame and right clicked the mouse. For Actions class you need to add perform() SHIT!
        sleep(5000);
        driver.close();
   }//end of rightClick()

   @Test
   public void sendKeys() throws InterruptedException {

       WebDriver driver = new FirefoxDriver();
       driver.get("http://www.google.com");

 //      WebElement erich = driver.findElement(By.className("gb_P"));
       WebElement rick = driver.findElement(By.className("gsfi"));
       Actions build = new Actions(driver);
//            build.contextClick(rick);   //this is click the right mouse button.
//        build.click(rick);
       build.keyDown(rick,Keys.SHIFT)
        .sendKeys("a")
        .keyUp(rick,Keys.SHIFT)
        .perform();
       sleep(5000);
       driver.close();
   }
//**********************************************************************************************************************
   @Test
   public void popupWindows() throws InterruptedException {  //exception is for sleep().
        int count = 1;
//        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        driver.get("http://www.popuptest.com/popuptest8.html");

        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles  this is a Set interface (no duplicates)
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){   //you can use a for loop here, but iterator is cool.
           System.out.println(count++ + " window(s)");
           subWindowHandler = iterator.next();
           System.out.println(count++ + " window(s)");
           System.out.println(subWindowHandler);
        }
        driver.switchTo().window(subWindowHandler); // switch to new popup window
//THIS NOW WORKS YEAH BOOM BOOM FIREWORKS.
       sleep(5000);
//       System.out.println(subWindowHandler);

//*********************************************************************************************************************1
        driver.switchTo().window(parentWindowHandler);  // switch back to parent window
        WebElement popup = driver.findElement(By.cssSelector("#dropin > div > a"));
        System.out.println(popup.getText());
        popup.click();
        sleep(5000);
        driver.close();
   }

//********************************************BEGIN TAKE SCREENSHOT USING DESIRED CAPABILITIES**************************
    @Test
    public void capabilities() throws IOException, InterruptedException   {  //this takes a screenshot of bing

        /**
         * This creates a hashmap then adds a capabitlity "takesScreenShot", true
         */

        Map<String,Boolean> theCapabilitiesMap = new HashMap<String,Boolean>();  //creates a hashmap with string, boolean
        theCapabilitiesMap.put("takesScreenShot", true);                        //inserts <string>, boolean in Map
        theCapabilitiesMap.put("stuff", false);

        System.out.println(theCapabilitiesMap.get("takesScreenShot"));
        System.out.println(theCapabilitiesMap.get("stuff"));
        System.out.println(theCapabilitiesMap.keySet());
        System.out.println("The size of Map is: " + theCapabilitiesMap.size() + "\n");

        DesiredCapabilities capabilities = new DesiredCapabilities(theCapabilitiesMap);  //this passes theCapabilitiesMap map to DesiredCapabilities constructor

        /**
         * creates a webdriver, maximizes the window, then opens bing for their pretty pictures.
         */
        System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
        WebDriver theDriver = new ChromeDriver();
        theDriver.manage().window().maximize();                                 //this im familiar with
        theDriver.get("http://www.bing.com");

        sleep(5000);
        File scrFile = ((TakesScreenshot)theDriver).getScreenshotAs(OutputType.FILE);
        System.out.println("GETTING THE PATH FOR THE SCREENSHOT: " + scrFile.getAbsolutePath());
            // now copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(scrFile, new File("C:/temp/screenShot.png")); // scrFile is lost once jvm stops so the file is copied to screenShot.png
        System.out.println("Is the capabilities Map empty??: " + theCapabilitiesMap.isEmpty());
        assertFalse(theCapabilitiesMap.isEmpty());  //should return "false" as the Map collection is not empty.
        sleep(5000);
        theDriver.quit();
    }

//********************************************END OF TAKE SCREENSHOT****************************************************

    @Test
    public void getDropDown() throws InterruptedException  {
    //open and login into Monster.com

        final String LOGIN = "Test@paxata.com";
        final String PASSWORD = "paxata123";

//        WebDriver driver = new FirefoxDriver();
//        driver.get("http:www.monster.com");

        System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http:www.monster.com");

        driver.findElement(By.className("dropdown-toggle")).click();
        sleep(2000);
//        monster.click();
        driver.findElement(By.cssSelector("#s-menu-d > li:nth-child(1) > a:nth-child(1)")).click();
        sleep(3000);
//        dracula.click();
        driver.findElement(By.id("EmailAddress")).click();
        Actions build = new Actions(driver);
        build.sendKeys(LOGIN);
             build.sendKeys(Keys.TAB);
             sleep(2000);
             build.sendKeys(PASSWORD);
             build.sendKeys(ENTER);
             sleep(3000);
        build.perform();
        sleep(5000);
        //there are popups windows that occur here.
        driver.close();
    }



@Test
public void switchToWindows() throws AWTException, InterruptedException     {
    //open test window and click on link
//    System.setProperty("webdriver.gecko.driver", "C:/Users/Madankumar/Desktop/Gecko Driver/geckodriver.exe");
//    WebDriver driver=new FirefoxDriver();
//    driver.navigate().to("http://www.google.com");

    System.setProperty("webdriver.chrome.driver", "\\DriversForSelenium\\chromedriver.exe");
    WebDriver drive = new ChromeDriver();
    drive.get("file:///C:/Temp/Window.html");
//    drive.manage().window().maximize();

    String parentWindowHandler = drive.getWindowHandle(); // Store your parent window
    String subWindowHandler = null;
    System.out.println("parent window is 'Google Search': " + parentWindowHandler);
    sleep(5000);
    //**************************************************************************************************************
    //**************************************************Using the code to click on the "Google Search" button.
    WebElement dude = drive.findElement(By.xpath("/html/body/a"));
    String aLink = drive.getWindowHandle();
    System.out.println("This is the window.html window handle: " + aLink);
    Actions build = new Actions(drive);
         build.moveToElement(dude)

        .contextClick(dude)   //contextClick- right click on element..MOUSE RIGHT CLICK ON WEBELEMENT.
        .perform();  // this will perform right click on webelement "dude".

    Robot bot = new Robot();  // automated keystrokes to simulate user using arrow keys
    bot.keyPress(KeyEvent.VK_DOWN);
    bot.delay(1000);
    bot.keyPress(KeyEvent.VK_DOWN);
    bot.delay(1000);
    bot.keyPress(KeyEvent.VK_ENTER);
    bot.delay(1000);                                                       //the code is running too FAST!!!!!!!
//    bot.mouseRelease(KeyEvent.VK_ENTER);   doesn't work. throws error
    Set<String> handles = drive.getWindowHandles(); // get all window handles  this is a Set interface (no duplicates)
//****************************************************************************************************************
    Iterator<String> iterator = handles.iterator();
    int count = 1;
    while (iterator.hasNext()){
        System.out.println(count + " window(s): loop "+ count);
        subWindowHandler = iterator.next();
        System.out.println(subWindowHandler);
        count++;
    }
    //switch.window does not work fucker!!!!!!!!
    for(String handle:drive.getWindowHandles()) {
        drive.switchTo().window(handle);
        sleep(3000);
    }

//the switch widow does NOT work!!!!!!!FUCKER!!!!
    drive.switchTo().window(parentWindowHandler);
    sleep(3000);
    System.out.println(drive.getWindowHandles());
    System.out.println("parent window is " + parentWindowHandler);
    System.out.println("sub-window is " + subWindowHandler);
//    drive.switchTo().window();

//BE CAREFUL THAT THE CODE DOESN'T MOVE TOO FAST!!!
}
 @Test
 public void switchToFrame() throws InterruptedException   {

    System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
    ChromeDriver erich = new ChromeDriver();
    erich.get("file:///C:/Temp/Frames.html");

    Actions doStuff = new Actions(erich);
    erich.switchTo().frame(0);
    WebElement txt = erich.findElement(name("1"));
    txt.sendKeys("I'm fucking in one");

    sleep(3000);
    erich.switchTo().defaultContent();  //what is this????

    erich.switchTo().frame(1);
    txt = erich.findElement(name("2"));
    txt.sendKeys("This is frame 2");

 }

 @Test
 public void handlingAlerts() throws InterruptedException   {

    System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("file:///C:/Temp/alerts.html");

    WebElement rick = driver.findElement(By.xpath("/html/body/fieldset/button"));
    sleep(3000);
    rick.click();

    Alert alert =driver.switchTo().alert();
    sleep(3000);
    alert.dismiss();
    sleep(3000);
    driver.quit();
 }

 @Test
 public void exploringNavigate() throws InterruptedException   {

    System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("http://www.google.com");     //navigate.to

    WebElement erich = driver.findElement(name("q"));
    erich.click();
//    sleep(2000);
    erich.sendKeys("cnn");
//    sleep(3000);
    WebElement eric = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a"));
    eric.click();

    driver.navigate().back();             //navigate().back()
 //   sleep(3000);
    driver.navigate().back();
  //  sleep(3000);
    driver.navigate().forward();
 //   sleep(2000);
    driver.navigate().refresh();
    driver.close();
 }

 @Test
 public void waitingFOrWebElements() throws InterruptedException    {

    System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
//IMPLICIT WAIT WORKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.navigate().to("localhost:8080");  //THIS IS THE JENKINS SERVER RUNNING ON MY LAPTOP. NEED TO START USING SC start jenkins

    WebElement jenkins = driver.findElement(name("j_username"));
    jenkins.sendKeys("esickert");
    sleep(2000);
    WebElement jenkinsPass = driver.findElement(name("j_password"));
    jenkinsPass.sendKeys("Claude111");
    jenkinsPass.sendKeys(ENTER);
}

@Test
public void testWithNewFireFoxSetup() throws InterruptedException {

    LoggingPreferences pref = new LoggingPreferences();

    pref.enable(LogType.BROWSER, Level.OFF);
    pref.enable(LogType.CLIENT, Level.OFF);
    pref.enable(LogType.DRIVER, Level.OFF);
    pref.enable(LogType.PERFORMANCE, Level.OFF);
    pref.enable(LogType.PROFILER, Level.OFF);
    pref.enable(LogType.SERVER, Level.OFF);

    DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
    desiredCapabilities.setCapability(CapabilityType.LOGGING_PREFS, pref);

    System.out.println("BELOW ARE THE GECKO DRIVER LOGS BEING PRINTED TO OUPUT SCREEN-figure out how to turn off!!!!!!!!!!");
//    System.setProperty("webdriver.gecko.driver", "c:\\DriversForSelenium\\geckodriver.exe");  //firefox driver - this doesn't work
    System.setProperty("webdriver.firefox.marionette", "c:\\DriversForSelenium\\geckodriver.exe"); //firefox driver - this works


//    System.setProperty("webdriver.chrome.driver", "c:\\DriversForSelenium\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
//    chrome.get("http://www.google.com");

 /*   FirefoxProfile profile = new FirefoxProfile();
    profile.setPreference("webdriver.log.browser.ignore", true);
    profile.setPreference("webdriver.log.driver.ignore", true);
    profile.setPreference("webdriver.log.profiler.ignore", true);
*/
    FirefoxDriver driver = new FirefoxDriver();

//    WebDriver driver = new FirefoxDriver(desiredCapabilities);
    driver.get("http://www.yahoo.com");
    WebElement test = driver.findElement(name("p"));
    test.click();
    test.sendKeys("cnn");
    test.sendKeys(ENTER);
 //   sleep(5000);
 //   driver.close();
    sleep(5000);
 //   WebDriverWait wait = new WebDriverWait(driver,30);
 //These don't work. xpath is incorrect!!!!
 //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[3]/div/div/div[1]/div/div[2]/div/div[1]/ol/li[1]/div/div[1]/h3/a")));
//    WebElement cnn = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div[1]/div/div[2]/div/div[1]/ol/li[1]/div/div[1]/h3/a"));

    driver.findElement(By.linkText("CNN - Top News")).click();
//    cnn.click();  //need explicit timeout here as window closes before ccn opens
    sleep(5000);
    driver.quit();
    }

//**********************************************************************************************************************
//**********************************************************************************************************************
@Test
public void cookies() throws InterruptedException  {

    System.setProperty("webdriver.firefox.marionette", "c:\\DriversForSelenium\\geckodriver.exe");
    FirefoxDriver driver = new FirefoxDriver();

    driver.get("http://www.google.com");

//  THIS IS AN EXAMPLE OF EXPLICIT WAIT.
    WebElement pleaseWaitBuddy = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(name("q")));

/*    WebElement element = (new WebDriverWait(driver, 5)).until(new ExpectedCondition<WebElement>() {

        @Override
        public WebElement apply(WebDriver d)    {
            return d.findElement(By.name("q"));  //this will fail after 5 seconds
        }
        });
*/
    pleaseWaitBuddy.sendKeys("cbsNews news");
//    sleep(3000);
    pleaseWaitBuddy.sendKeys(ENTER);
//    sleep(2000);

    WebElement cbsNews = driver.findElement(By.cssSelector("div._NId:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)"));
//    WebDriver cnn = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div._NId:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)")));
    cbsNews.click();
    }

    @Test
    public void testStoreCookieInfo() throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
//        WebDriver linkedin = new ChromeDriver();

        System.setProperty("webdriver.firefox.marionette", "c:\\DriversForSelenium\\geckodriver.exe");
        FirefoxDriver linkedin = new FirefoxDriver();

        linkedin.get("https://www.linkedin.com");

     //   linkedin.findElement(By.xpath("//*[@id=\"session_key-login\"]")).sendKeys("esickert@gmail.com");
        linkedin.findElement(By.name("session_key")).sendKeys("esickert.gmail.com");
//        linkedin.findElement(By.xpath("//*[@id=\"session_password-login\"]")).sendKeys("Busby111");
        linkedin.findElement(By.name("session_password")).sendKeys("Busby111");
//        linkedin.findElement(By.name("persistent")).click();    I DON'T KNOW WHAT THIS IS!!!!!!!!!!!!!
//        linkedin.findElement(By.xpath("//*[@id=\"session_password-login\"]")).submit();
 //      linkedin.findElement(By.id("login-submit")).submit();

//        linkedin.findElement(By.xpath("//*[@id=\"btn-primary\"]")).click();

        File writeBrowserData = new File("c:\\Temp\\browser.data");
        try {
//            browserData.delete();
            writeBrowserData.createNewFile();

            FileWriter fileWrite = new FileWriter(writeBrowserData);
            BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
            for(Cookie myCookie: linkedin.manage().getCookies())    {   //using the NEW for loop
                bufferWrite.write((myCookie.getName() + " ; " + myCookie.getValue() + " ; " + myCookie.getDomain() + " ; " + myCookie.getPath() + " ; " + myCookie.getExpiry() + " ; " + myCookie.isSecure()));
                bufferWrite.newLine();
                System.out.println(myCookie.getName() + " ; " + myCookie.getValue() + " ; " + myCookie.getDomain() + " ; " +  myCookie.getPath() + " ; " + myCookie.getExpiry() + " + " + myCookie.isSecure());
            }
            bufferWrite.flush();
            bufferWrite.close();
            fileWrite.close();
        }catch(Exception ex)    {
            ex.printStackTrace();
        }
//        sleep(5000);
//        linkedin.quit();
    }  //end of testStoreCookieInfo()

   @Test
    public void testLoadCookieInfo()    {   //this runs but doesn't save info to cookies!!!!!!!!!!!!!!!!!!!!!!!!!!!!

 //       System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
 //       WebDriver linkedin = new ChromeDriver();
 //       linkedin.get("https://www.linkedin.com/uas/login");

        System.setProperty("webdriver.firefox.marionette", "c:\\DriversForSelenium\\geckodriver.exe");
        FirefoxDriver linkedin = new FirefoxDriver();

        linkedin.get("https://www.linkedin.com");

        try {
            File readBrowserData = new File("c:\\Temp\\browser.data");
            FileReader fileRead = new FileReader(readBrowserData);
            BufferedReader bufferRead = new BufferedReader(fileRead);
            String line;
            while ((line=bufferRead.readLine()) != null)  {
                StringTokenizer str = new StringTokenizer(line, ";");
                while (str.hasMoreTokens()) {
                    String name = str.nextToken();
                    String value = str.nextToken();
                    String domain = str.nextToken();
                    String path = str.nextToken();
                    Date expiry = null;



                    String dt;
                    if (!(dt=str.nextToken()).equals("null"))   {
 //                      expiry = new Date(dt);                           //the class Date here is deprecated (obsolete).
                    }
                    Boolean isSecure = new Boolean(str.nextToken()).booleanValue();
                    Cookie myCookie = new Cookie(name,value,domain,path,expiry,isSecure);
                    System.out.println(myCookie.getName() + " ; " + myCookie.getValue() + " ; " + myCookie.getDomain() + " ; " +  myCookie.getPath() + " ; " + myCookie.getExpiry() + " + " + myCookie.isSecure());

                   linkedin.manage().addCookie(myCookie);
                }
            }
        }   catch(Exception ex)   {
                ex.printStackTrace();
        }
        linkedin.get("https://www.linkedin.com");
//        linkedin.get("https://www.linkedin.com/uas/login");
    }
//**********************************************************************************************************************

@Test
public void softQEWebsite() throws InterruptedException {

    //    System.setProperty("webdriver.chrome.driver","\\DriversForSelenium\\chromedriver.exe");
    //    WebDriver driver = new ChromeDriver();

        //opens firefox web browser
        System.setProperty("webdriver.firefox.marionette", "c:\\DriversForSelenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();


        driver.get("http://www.softqe.com");

    //    Cookie seleniumCookie = new Cookie("myCookie","name1=val1,name2=val2");
        Cookie seleniumCookie = new Cookie("myCookie","name1=erich,name2=sickert");
        driver.manage().addCookie(seleniumCookie);
        sleep(5000);

        for(Cookie cookieVar: driver.manage().getCookies())  //for loop prints out
        {
            System.out.println(cookieVar.getName() + " => " +cookieVar.getDomain()  );
        }
    }  //end 0f softQEWebsite

@Test
public void seleniumPractice() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "c:\\DriversForSelenium\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();

    driver.get("http://www.google.com");

    WebElement stuff = driver.findElement(By.className("gsfi"));
    stuff.sendKeys("microsft bing");
    stuff.sendKeys(ENTER);
    sleep(5000);
    driver.executeScript("window.scrollBy(0,1000)", "");
}

@Test
public void playingWithFirefox()    {

    FirefoxProfile myFirstFFProfile = new FirefoxProfile();

//    try
//    {
        myFirstFFProfile.addExtension(new File("c:\\tmp\\firebug-2.0.19.xpi"));
/*    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
*/
    System.setProperty("webdriver.firefox.marionette", "c:\\DriversForSelenium\\geckodriver.exe");
    FirefoxDriver theBook = new FirefoxDriver(myFirstFFProfile);



    theBook.get("http://www.google.com");

    }
} // end of SeleniumTest