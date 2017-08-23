package Savitch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/**
 * Created by esickert on 8/21/2017.
 */
public class InputFromTheKeyboard     {
    public static void main(String[] args)  throws InterruptedException{           //NOTE there is a main method here!!!!!!!!!!!

        System.out.println("Please enter a path and file name: ");
        Scanner userInput = new Scanner(System.in);
        String filename = userInput.next();

        Scanner inputStream = null;
        System.out.println(filename);

        File myFile = new File("c:/tmp/output.txt");   //remember this is a string input.
        try{
            myFile.createNewFile();
        }
        catch(IOException e) {
            System.out.println("ERROR");
        }
        System.out.println("Does this file exist? " + myFile.exists());

        try
        {
            inputStream = new Scanner(new File(filename));

        }
        catch(FileNotFoundException e)
        {
            System.out.println("ERROR");
            System.exit(0);
        }
        while (inputStream.hasNextLine())
        {
            String line = inputStream.nextLine();
            System.out.println(line);
        }
        sleep(10000);

        inputStream.close();

//        myFile.delete();
    }

}
