package Savitch;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveToFileStuff {

    @Test
        public void textFile() {
        String filename = "c://tmp//createTextFile.txt";
        PrintWriter outputStream = null;
        Scanner inputStream = null;

        try
        {
            outputStream = new PrintWriter(filename);
        }
        catch(IOException e)
        {
            System.out.println("IOExcetion has occurred");
            System.exit(0);
        }
            outputStream.println("We the people vvof the United States");
            outputStream.println("in order to form a more perfect union");
            System.out.println("Text has been witten to createTextFile");
            outputStream.close();  //we need to close the stream so the text is written to the file


        try

       {
            inputStream = new Scanner(new File(filename));
       }
       catch(IOException e) {
           System.out.println("ERROR");
           System.exit(0);
       }
       while(inputStream.hasNext())
       {
           String word = inputStream.next();
           String line = inputStream.nextLine();
           System.out.println(line);
       }
        inputStream.close();
    }

}