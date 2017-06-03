package com.esickert;

import com.esickert.testcases.EmptyUser;
import com.esickert.testcases.User;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * Created by esickert on 5/5/2017.
 */
public class UserTest {
    public static void main(String[] args)  {

        User erich  = new User();
        EmptyUser rick = new EmptyUser();

        System.out.println("The initial username is: " + erich.getUsername());
        System.out.println("The initial password is: " + erich.getPassword());
//        assertEquals("checking password","admin" , (erich.getPassword()));
        System.out.println("******************************************");
        System.out.print("Resetting pasword...");
        erich.setPassword("Admin111");
        System.out.println(erich.getPassword());

        System.out.println("password for rick is : " + rick.getPassword());
        rick.setUsername("erich");
        System.out.println(erich.getUsername());
        System.out.println(rick.getUsername());
    }
}

