package Savitch;

import org.junit.Test;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.*;

import static java.lang.Thread.sleep;

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
     public void writeToFile()    {  //this creates file sam.txt and writes to it.

//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Please enter the full path for a file: ");
//        String filename = userInput.next();
           String filename = "c:\\tmp\\sam.txt";   //a file String variable
//            File filename = new File("c:\\tmp\\sam.txt");    //this uses the File class to create a file            PrintWriter outputStream  = null;    //creates a stream variable, also needs to be initialized.
//            System.out.println(filename.exists());
            PrintWriter outputStream = null;

            try {
                outputStream = new PrintWriter(filename);  //stream variable

                outputStream.println("This is the end, beautiful friend");  //outputs to file
                outputStream.println("This is the end, my only friend, the end");//stream variable "outputStream" uses print and println
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
     public void appendToFile() {  //this appends to a previously created file

        String filename = "c:\\tmp\\sam.txt";
        PrintWriter outStream = null;
     //   PrintWriter putStream = new PrintWriter(filename);
        try {
  //          outStream = new PrintWriter(filename);
//            outStream.println("This is the end");
//            outStream.println("beautiful friend");

           outStream = new PrintWriter(new FileOutputStream(filename, true));
          outStream.println("Of our elaboate plans, the end");      //this worked!! Problem: file created somewhere else!!
           outStream.println("Of eveverything that stands, the end");

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

    @Test
    public void printFileContentsToScreen()    {
        String filename = "c:\\tmp\\rtlSalesKY.txt";
        Scanner inputStream = null;
        System.out.println("The file " + filename + " contains the following lines: \n");

        //   String filename = inputStream.nextLine();
        //   System.out.println(filename);

        try
        {
            inputStream = new Scanner(new File(filename));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("ERROR-trying to open file " + filename);
            System.exit(0);
        }
        {
            while (inputStream.hasNextLine())
            {
                String line = inputStream.nextLine();
                System.out.println(line);
            }
            inputStream.close();
        }
    }

    @Test
    public void question8Chap10() throws InterruptedException {

        String myFilename = new String("c:\\tmp\\sam.txt");
        PrintWriter textStream = null;

        try {
            textStream = new PrintWriter(myFilename);

            textStream.println("Lions in the street and roaming");
            textStream.println("Dogs in heat rabid foaming");

        }
        catch(FileNotFoundException e)
        {
            System.out.println("ERROR-File not found");
            System.exit(0);
        }
        finally
        {
            textStream.close();
        }

        sleep(5000);

        System.out.println("The contents of " + myFilename + " are: ");
        Scanner inputStream = null;
        try {
            inputStream = new Scanner(new File(myFilename));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("ERROR- file not found");
            System.exit(0);
        }
        while (inputStream.hasNextLine())
        {
            String line = inputStream.nextLine();
            System.out.println(line);
        }
        inputStream.close();
    }

    @Test
    public void chap10Problem11()    {

        File filename = new File("c:/tmp/sam.txt");
        if (filename.exists())
            if (filename.delete())
                System.out.println(filename + " is deleted");
    }
}



