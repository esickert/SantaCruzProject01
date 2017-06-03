package com.esickert.testcases;

/**
 * Created by esickert on 5/8/2017.
 */
public class EmptyUser extends User {   //these methods are being inherited. The also override

    @Override
    public void setUsername(String username)   {
        System.out.println("This just prints  out some text, but overides erich.setUserName()" + username);
    }

    @Override
    public String getUsername()   {
        return "Hello there!!";
    }
}
