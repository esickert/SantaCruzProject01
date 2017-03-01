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

        @Test  // this is an answer to the assignment on page
        public void confirmArrayCreation()  {

            User[] stuff = new User[100];
            for(int i = 0; i <= stuff.length-1; i++)    {
                User user = new User("User" + i, "password" + i);
                user.setUsername("User-" + i);
                user.setPassword("Password" + i);
                stuff[i] = user;
                System.out.println(user.getUsername() + "\n" + user.getPassword() + "\n--------------");
                assertEquals("Confirm array created and its size is correct???",99, stuff.length);
            }       //the array is being created in that the length is verified...i think.
        }

        @Test
        public void arrayOf100()    {
            User[] arr = new User[100];
            int index = 0;
            //this uses the new for-each loop
            for(User temp: arr) {   //i think this is in alot of the code others write.
                User user = new User("user" + index, "password" + index);
                user.setUsername("User-" + index);
                user.setPassword("password-" + index);
                arr[index] = user;
                System.out.println(user.getUsername() + "\n" + user.getPassword() + "\n***************");
                index++;
            }
        assertEquals(index,1000);
    }

} // end of Test9