package Savitch;

import org.junit.Test;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.*;

/**
 * Created by esickert on 8/4/2017.
 */
public class File10 {

    @Test
    public void writingTheGreatAmericanNovel()  {//throws IOException  {
        String fileName = "c:\\Temp\\erich.txt";
        // this will create a file in the Temp directory. No
        // directory path, created in the home directory of program
        File theFile = new File(fileName);
        try {
        theFile.createNewFile();

        PrintWriter outputStream = null;
        outputStream = new PrintWriter(fileName);
        outputStream.println("This is the end!!!");  //writes to the file
        outputStream.println("Beautiful friend");    //writes to the file
        outputStream.println("...and this file creating/writing worked!!!!");
        outputStream.println("This is the end!!!");  //writes to the file
        System.out.println("Does erich.txt exist??: " + theFile.exists());

        outputStream.close();  //closes the created file
        } catch (Exception e)   {
            e.printStackTrace();
        }//creates the file in the directory
    }



    /**
     * Created by esickert on 8/14/2017.
     */
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



