package Savitch;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.OutputStream;

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
 //       try {
        theFile.createNewFile();

        PrintWriter outputStream = null;
        outputStream = new PrintWriter(fileName);
        outputStream.println("This is the end!!!");  //writes to the file
        outputStream.println("Beautiful friend");    //writes to the file
        outputStream.println("...and this file creating/writing worked!!!!");
        outputStream.println("This is the end!!!");  //writes to the file
//        System.out.println("Does erich.txt exist??: " + theFile.exists());

        outputStream.close();  //closes the created file
        } catch (Exception e)   {
            e.printStackTrace();
        }//creates the file in the directory




    }

}
