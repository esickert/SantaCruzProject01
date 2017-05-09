package com.esickert.testcases;
import com.esickert.*;
import org.junit.Test;

/**
 * Created by esickert on 2/21/2017.
 */

public class User {

    //    private String username;
    private String username;
    private String password;



    public User()  {  // a constructor
        username = "username123";
        password = "admin";
    }  //end of constructor


    public User(String username,String password)    {  //a Contructor
        this.username = username;
        this.password = password;
    }  //end of constructor



    public String getPassword(){
        return password;
    }


    public void setPassword(String password) {
        if (password.length() <= 7) {
            throw new IllegalArgumentException("Password must be greater than 7 charcters");
        }

        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}  //end of class User



