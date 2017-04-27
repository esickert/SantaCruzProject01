package com.esickert.testcases;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertNotEquals;
//import java.util.Arrays;
import java.util.*;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by esickert on 3/13/2017.
 */
public class Test10 {

    String[] someDays = {"tuesday", "Thursday",
            "Wednesday", "Monday",
            "Saturday", "Sunday",
            "friday"};

   Collection gameOfThrones = new ArrayList();



    @Test public void simpleCollectionEx()  {
        String[] numbers = {"zero", "one", "two", "three"};
        List<String> numbers0123 = Arrays.asList(numbers);     //simple example of collections

        for(String temp:numbers0123)    {
            System.out.println(temp);
        }

        assertEquals("zero", numbers0123.get(0));
//        assertEquals("is two equal to 2???","two", numbers0123.get(3));
        numbers0123.set(0, "one");//in List(index, element);
        System.out.println(numbers0123.get(0) + " line 26"); //******************using set here because add is not allowed as umbers0123 is an array.

        //Note this is jumping right into collections using lists. Here we are doing something that i don't understand.

    } //end of simpleCollections

    @Test
    public void dynamicCollection() {

        List<String> num0123 = new ArrayList<String>();

        num0123.add("zero");
        num0123.add("one");
        num0123.add("two");
        num0123.add("three");

        for(String temp:num0123)    {
            System.out.println(temp + " ");
        }

        assertEquals("two", num0123.get(2));
        assertEquals("three", num0123.get(3));

       List<String> game = new ArrayList<String>();  //List is an interface. Cannot instatiate an interface, only classes can be instantiated.
    }

    @Test
    public void forEach()   {
        //this is weird WEIRD!!!!!!!!!!


        List<String> week = Arrays.asList(someDays);  //this is different syntax. NOTE no keyword 'new'.

        int index = 0;
        for(String temp: week)  {
            if (temp.equals("Monday"))   {
                System.out.println("Monday is at index " + index);
                break;
            }
            index++;
        }
        assertEquals("Monday is at index 3",3, index);



    } //end of loopityLoop

    @Test
    public void whileLoop()  {

        String[] someDays = {"tuesday", "Thursday",
                "Wednesday", "Monday",
                "Saturday", "Sunday",
                "friday"};

        String day = "friday";

        List<String> week = Arrays.asList(someDays);  //this is different syntax. NOTE no keyword 'new'.

        int index = 0;
        while ( !(week.get(index).equals(day))) {
 //           System.out.println(index);
            index++;
        }
        System.out.println(day + " is at index " + index);
        assertEquals("index should be:", 6, index);
    }

    @Test
    public void doWhile()   {
    //this is my solution, not the authors!!!!!

        String[] someDays = {"tuesday", "Thursday",
                "Wednesday", "Monday",
                "Saturday", "Sunday",
                "friday"};

        List<String> week = Arrays.asList(someDays);  //this is different syntax. NOTE no keyword 'new'

        String day = "friday";
        int index = 0;

        do  {
            if ((week.get(index).equals(day)))   {
                System.out.println(week.get(index) + " is at index " + index);
                break;
            }
            index++;
        } while (week.size() > index);

        assertEquals("epected index", 6, index); //index -1 because
    }// end of doWhile

    @Test
    public void assign1Chap10Page146() throws Exception  {

        String[] someDays = {"tuesday", "Thursday",
                "Wednesday", "Monday",
                "Saturday", "Sunday",
                "friday", "me"};

        List<String> week = Arrays.asList(someDays);  //this is different syntax. NOTE no keyword 'new'
        int counter = 0;
        while (week.size()> counter)    {
            System.out.println(week.get(counter));
            counter++;  // don't forget to increment the counter  dumbshit
        }
        sleep(5000);
        System.out.println();
        for(int i = 0; week.size() > i; i++)    {
            System.out.print(week.get(i) + " ");
        }
        System.out.println();
        sleep(5000);
        for(String temp: week)  {
            System.out.print(temp + " ");
        }

        assertNotEquals(week, "[tuesday, Thursday, Wednesday, Monday, Saturday, Sunday, friday, me]" );
        assertThat(week,is((week)));  //playing with different asserts.
    } //end of assign1Chap10Page146

    @Test
    public void playingInterfaces() {

        Collection game;  //*********************************************************************
        game = new ArrayList();  //new syntax for <String>,  <>,  from java 1.7


        game.add("monopoly");
        game.add("life");
        game.add("chess");
        game.add("checkers");
        game.add("poker");
        System.out.println("Does game contain checkers??:" + game.contains("checkers"));
//        System.out.println(game.get(1));  //  NO get() in Set!!! Note this is List

 //       for(Object temp: game) {  //remember the semicolon!!!!!!!!
 //           String temp2 = (String)temp;
 //           System.out.print((String)temp2 + ", ");
 //       }
        gameOfThrones.addAll(game);         //the syntax here is kinda strange.   destinationCollection.addAll(sourceCollection);
        for(Object temp3: gameOfThrones) {
            String temp4 = (String) temp3;
            System.out.println( temp4);
        }
//        assertEquals(game.size(),gameOfThrones.size()+1);  //this works now!!!

 //       game.clear();
        assertNotEquals(game.size(), 4);

        Collection moreGames = new ArrayList<>();

        moreGames.addAll(gameOfThrones);

/*        for(Object temp: moreGames) {
            String test = (String)temp;
            System.out.println(test);
      } */

        moreGames.remove("poker");

        for(Object temp: moreGames) {
            String test = (String) temp;
            System.out.println(temp);
        }

        System.out.println(moreGames.contains("poker"));
        assertEquals("Does moreGames NOT contain poker:", false,moreGames.contains("poker"));

 //       moreGames.clear();
        assertEquals("Is empty:", false, moreGames.isEmpty());

    }

    @Test
    public void collectStuff()  {

        Collection moreGames = new ArrayList<>();

        moreGames.addAll(gameOfThrones);
        assertEquals("Are they equal???", moreGames, gameOfThrones);
        moreGames.add("clue");
        for(int i = 0; i <= 10; i ++)   {
            moreGames.add("user" + i);
            gameOfThrones.add("games" + i);
        }
        gameOfThrones.addAll(moreGames);
        System.out.println(moreGames.size());
        System.out.println(gameOfThrones.size());
        gameOfThrones.removeAll(moreGames);
        System.out.println("GameOfThrones is " + gameOfThrones.size());
//        System.out.println(gameOfThrones.get(0));
    }

    @Test
    public void toGameOfThrones() {  //???????????????????????????????????????? THIS DOESN'T WORK.
        for(int i = 0; i <= 10; i ++)   {
//            moreGames.add("user" + i);
            gameOfThrones.add("games" + i);
        }
        System.out.println("GameOfThrones is " + gameOfThrones.size());
        for(Object temp: gameOfThrones) {
            String word = (String)temp;
            System.out.println(temp);
        }
    }

    @Test
    public void exercise10Page157() {

        Collection users = new ArrayList();
        System.out.println(users.size());
        assertEquals("Are they equal??", 0, users.size());
        assertEquals("Is it empty", users.isEmpty(), true);

        users.add("mathew");
        users.add("mark");

        System.out.println("There are " + users.size() + " users");
        assertTrue( 2 == users.size());
        assertEquals(users.isEmpty(), false);

        Collection users2 = new ArrayList();
        users2.add("luke");
        users2.add("john");
        System.out.println("The size of users2 is : " + users.size());
        for(Object temp: users2)    {
            String tmp = (String)temp;
            System.out.println(temp + " ");
            System.out.println();
        }
        users2.addAll(users);
        for(Object temp: users2)    {
            String tmp = (String)temp;
            System.out.println(temp + " ");
        }

        System.out.println("Remove users from users2");

        users2.removeAll(users);  //remove users from users2
        for(Object temp: users2)    {
            String tmp = (String)temp;
            System.out.println(temp + " ");
        }
        users.clear();
        assertEquals(0, users.size());

        String[] test = new String[2];
        users2.toArray(test);
        for (int i = 0; i <= test.length-1; i++)    {  //we do - 1 because the array indices begin at 0!!!!!
            System.out.print(test[i] + " COOL test is an array ");
        }
    }


    @Test
    public void testMe()        {
        String x = "aaaaaaaaaaaaaaa";
        System.out.println("Mondaysss".length());  //this is new to me getting the length of a string
        System.out.println(x.length());
//        assertEquals("Monday".length(),(String)daysOfWeekArray[0]).length());
    }

    @Test
    public void aList() {
        List<String> stuff = new ArrayList<>();
        stuff.add("hawaii");
        stuff.add("caligornia");
        stuff.add("new yoork");

        for(String temp: stuff) {
            System.out.println(temp);
        }
        System.out.println("************************");
        stuff.remove(2);

        for(String temp: stuff) {
            System.out.println(temp);
        }
    }

    @Test
    public void userList()  {   //page 163

        List<String> users = new ArrayList<>();
        users.add("samantha");
        users.add("roxane");
        users.add("beth");

        assertEquals(3, users.size());

        printMe(users);
        users.add(1, "mary");
        printMe(users);
        users.add(0, "steve");
        printMe(users);

        System.out.println("The index of mary is " + users.indexOf("mary"));
        assertEquals(2, users.indexOf("mary"));    //this ERRORS out

        users.remove(0);  //removed steve
        printMe(users);

        users.set(1,"SetMeUpBaby");
        printMe(users);

        List<String> sublist = users.subList(0,2);
        printMe(sublist);
    }

    public void printMe(List<String> stuff)   {   //note method overload with method below!!!!!!
        System.out.println("*********");
        for(String temp: stuff) {
            System.out.println(temp);
        }
    }

    @Test
    public void userSet()   {

        Set<String> stuff = new HashSet<String>();  //note: this uses a hashset
        stuff.add("mary");
        stuff.add("jane");
        stuff.add("mary");
        stuff.add("susan");

        printMe(stuff);
    }

    public void printMe(Set<String> stuff)   {  //note method overload with method above!!!
        System.out.println("*********");
        for(String temp: stuff) {
            System.out.println(temp);
        }
    }

    @Test
    public void  userMap()   {

        Set stuff = new HashSet();
        stuff.add("hello");
        stuff.add("there");
        stuff.add("hello");

        System.out.println("The size of stuff is " + stuff.size());

    }





    }  //end of Test10
