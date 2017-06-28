package com.esickert.testcases;

/**
 * Created by esickert on 5/12/2017.
 */
    public class NeedMoreMilkException extends RuntimeException    {
        public NeedMoreMilkException()  {

           super("More MILK- separate user-defined exception class"); //a constructor of parent RunTimeException.
        }
        public NeedMoreMilkException(String message)  {
           super(message);  //a constructor of parent class RunTimeException.
        }
    }

