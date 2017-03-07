package com.esickert.testcases;

import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.copyOf;
import static java.util.Arrays.sort;
import static org.junit.Assert.assertEquals;

/**
 * Created by esickert on 2/20/2017.
 */
public class Test9 {

    int

    @Test
    public void simpleArray()   {
        String[] numbers1 = new String[8];
        String[] numbers = {"zero", "one", "two", "three"};

        for(String numbersText: numbers)    {   // this is new for me
            System.out.print(numbersText + " ");
        }

        assertEquals("one", numbers[1]);
        assertEquals("three", numbers[3]);
    }

       @Test  //exercise 'Create array of Users' - page 125
        public void createUser()   {
//            new int[5];
            //these are creating objects of class User (note caps)
            User user0 = new User("eric", "pssswaord1");
            User user1 = new User("erich", "password2");
            User user2 = new User("erik","paaassword3");

            System.out.println(user1.getUsername());
            System.out.println(user1.getPassword());

            User[] arrayOfUsers = {user0, user1,user2};
            for(User user: arrayOfUsers)    {  //this is the new for loop the author calls "for each". iterate thru arraypage 126
                System.out.println(user.getUsername() + "\t" + user.getPassword());
            }

            assertEquals(user0.getUsername(), arrayOfUsers[0].getUsername());
            assertEquals(user1.getUsername(), arrayOfUsers[1].getUsername());  //this one will throw an error
            assertEquals(user2.getUsername(), arrayOfUsers[2].getUsername());
        } //end of createUser

        @Test
        public void LaterInitialize()   {
            String bad = "";
            int index = 0;
            String [] monsters;
            monsters = new String[10];

//            String[] monsters;
            monsters = new String [] {"frank","drac","wolfie","invisible","gillie"};

            for(String stuff:monsters)  {
                System.out.println(stuff);
            }

            for(String creatures:monsters) {
//                bad = creatures;
                bad = bad + "|" + creatures;

            }
            System.out.println(bad);
            assertEquals(bad, "|frank|drac|wolfie|invisible|gillie");
        }


        @Test
        public void DaysOfWeek()    {  //this is chapter 9
            String days = "";
            String[] workWeek = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday"};

                for(String workday: workWeek)  {
                    days = days + "|" + workday;
                }

            assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);

        }

        @Test  // this is an answer to the assignment on page130
        public void confirmArrayCreation()  {

            User[] stuff = new User[100];
            for(int i = 0; i <= stuff.length-1; i++)    {
                User user = new User("User" + i, "password" + i);
                user.setUsername("User-" + i);
                user.setPassword("Password" + i);
                stuff[i] = user;
                System.out.println(user.getUsername() + "\n" + user.getPassword() + "\n--------------");
                assertEquals("Confirm array created and its size is correct???",100, stuff.length);
            }       //the array is being created in that the length is verified...i think.
        }

        @Test  // this is an answer to the assignment on page130
        public void arrayOf100()    {
            User[] arr = new User[100];
            int index = 0;      //using an index in a for-each loop (modified for loop)
            //this uses the new for-each loop
            for(User temp: arr) {   //i think this is in alot of the code others write. temp is not an array but an element holder.
                User user = new User("user" + index, "password" + index);
                user.setUsername("User-" + index);
                user.setPassword("password-" + index);
                arr[index] = user;
                System.out.println(user.getUsername() + "\n" + user.getPassword() + "\n***************");
                index++;
            }
            assertEquals(index,100);
        }

        @Test // chap 9 Arrays class
        public void testArrayCopyOf()   {

            String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            String[] week;
            week = Arrays.copyOf(weekDays, 3);

          for(String temp: week)  {
            System.out.print(temp + " ");           // the print variable is TEMP NOT WEEK!!!! week is the array!!!  See Notes
          }
          System.out.println();
          for(int i = 0; i < week.length; i++)  {
            System.out.print(week[i] + " ");

//          assertEquals(null, week[5]);
  //        assertEquals(null, week[3]);
          }
        }

        @Test
        public void testCopySubSet()    {

            String[] workDays = {"monday", "Tuesday", "wednesday", "Thursday", "Friday", "Sat", "Sun"};
            String[] week = Arrays.copyOfRange(workDays,1,7);  // last index is exclusive

            sort(week);  //this is quicksort.

            for(String temp: week) {
                System.out.print(temp + " ");
            }
        }

        @Test
        public void newMethodsForArays()    {

            int[] nums = new int[] {2,4,7,4,3,1,9,8};
            int[] num2 = {1,2,3,4,5};
            String[] character = new String[20];

            System.out.println(nums[3]);
            System.out.println(num2[0]);

            Arrays.fill(character,0,7,"hello");
            for(String temp: character)    {
                System.out.print(temp + " ");
            }
            System.out.println();
            sort(nums);
            for(int temp: nums) {
                System.out.print(temp + " ");
            }

            assertEquals(4, nums[4]);
        }

        @Test
        public void sortWorkdays()  {  //PLAY WITH THIS MORE!!!!!!!!!!!!!!!!

            String[] workDays = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday"};
            //NOTE: Strings are sorted according to alphabetical order
            String[] work;
            Arrays.sort(workDays);
            work = workDays;
            for( String temp: work)
                System.out.print(temp + " ");

        assertEquals(workDays, "Monday Tuesday Wednesday Thursday Friday");  //THIS DOESN'T WORK!!!!!!!!!!!!!!!!!!
     //       assertEquals(work, workDays);
        }

        @Test
        public void testWorkDays()  {
            String[] workDays = {"monday", "Tuesday", "Wednesday","thursday", "Friday"};

            Arrays.sort(workDays);
            assertEquals(workDays[0], "Friday");
        }

        @Test
        public void multiDim()  {

            int[][] arr = new int[4][4];

            for(int i = 0; i < arr.length; i++) {
               System.out.println();
                for(int j = 0; j < arr[i].length; j++)  {
                    System.out.print(arr[i][j]);
                }
            }//end of first for loop


        @Test
        public void print2DArray(int [][] multi)   {     //THIS NEEDS TO HAVE THE MULTI ARRAY CREATED.
            for(int[] outer : multi) {
                if(outer == null) {
                    System.out.print("null");
                }else{
                    for(int inner : outer){
                        System.out.print(inner + ",");
                    }
                }
                System.out.print("");
            }
        }



} // end of Test9