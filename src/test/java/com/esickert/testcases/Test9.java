package com.esickert.testcases;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by esickert on 2/20/2017.
 */
public class Test9 {

    @Test
    public void simpleArray()   {

        String[] numbers = {"zero", "one", "two", "three"};

        for(String numbersText: numbers)    {   // this is new for me
            System.out.print(numbersText + " ");
        }

        assertEquals("one", numbers[1]);
        assertEquals("three", numbers[3]);
    }

       @Test  //exercise 'Create array of Users' - page 125
        public void createUesr()   {
            new int[5];
            User user0 = new User("eric", "pssswaord1");
            User user1 = new User("erich", "password2");
            User user2 = new User("erik","password3");

            System.out.println(user1.getUsername());
            System.out.println(user1.getPassword());

            User[] arrayOfUsers = {user0, user1,user2};
            for(User user: arrayOfUsers)    {  //this is the new for loop the author calls "for each". iterate thru arraypage 126
                System.out.println(user.getUsername() + "\t" + user.getPassword());
            }

            assertEquals(user0.getUsername(), arrayOfUsers[0].getUsername());
            assertEquals(user1.getUsername(), arrayOfUsers[1].getUsername());
            assertEquals(user2.getUsername(), arrayOfUsers[2].getUsername());

        } //end of creatAUser



}
