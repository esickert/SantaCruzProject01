package com.esickert;

import com.esickert.testcases.EmptyUser;
import com.esickert.testcases.User;

/**
 * Created by esickert on 5/5/2017.
 */
public class UserTest {
    public static void main(String[] args)  {

        User erich  = new User();
        EmptyUser rick = new EmptyUser();


        System.out.println(erich.getPassword());

        erich.setPassword("admin1");
        System.out.println(erich.getPassword());

        System.out.println("password for rick is : " + rick.getPassword());
        rick.setUsername("erich");
        System.out.println(erich.getUsername());
        System.out.println(rick.getUsername());
    }
}

