package com.esickert.testcases;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by esickert on 2/20/2017.
 */
public class Test9 {

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
            assertEquals(user1.getUsername(), arrayOfUsers[2].getUsername());  //this one will throw an error
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
} // end of Test9