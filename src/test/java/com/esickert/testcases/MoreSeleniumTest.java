package com.esickert.testcases;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by esickert on 8/14/2017.
 */
public class MoreSeleniumTest {

    @Test
        public void fileIO()    {

//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Please enter the full path for a file: ");
//        String filename = userInput.next();
        String filename = "c:\\tmp\\outputFile.txt";   //a file String variable
        PrintWriter outputStream  = null;    //creates a stream variable, also needs to be initialized.

        try {
            outputStream = new PrintWriter(filename);

            outputStream.println("This is the end");  //outputs to file
            outputStream.println("Beautiful friend");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + filename);  //if file does not exist throws IO error.
            System.exit(0);
        }
        finally
        {
            if (outputStream != null)   //remember the difference between assignment and "equals to". If == null, outputstream is empty.
                outputStream.close();   //if not null, buffer contains data to be sent to file?? .close sends whats in buffer to file.
        }


    }
}
