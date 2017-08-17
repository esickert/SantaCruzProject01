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
 //           String filename = "c:\\tmp\\outputFile.txt";   //a file String variable
            File filename = new File("c:\\tmp\\outputFile.txt");
            PrintWriter outputStream  = null;    //creates a stream variable, also needs to be initialized.
            System.out.println(filename.exists());

            try {
                outputStream = new PrintWriter(filename);

                outputStream.println("This is the end");  //outputs to file
                outputStream.println("Beautiful friend");//stream variable "outputStream" uses print and println
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

     @Test
     public void test() {

        String filename = "c:\\tmp\\sam.txt";
        PrintWriter outStream = null;

        try {
  //          outStream = new PrintWriter(filename);
//            outStream.println("This is the end");
//            outStream.println("beautiful friend");

           outStream = new PrintWriter(new FileOutputStream(filename, true));
          outStream.println("this is the end");      //this worked!! Problem: file created somewhere else!!
           outStream.println("my only friend, the end");

        }
        catch(FileNotFoundException e)
        {
            System.out.println("ERROR:Opening the file: " + filename);
            System.exit(0);
        }
        finally
        {
 //           if(outStream != null)
                outStream.close();
//        System.getProperty("sam.txt");
        }
     }

}



