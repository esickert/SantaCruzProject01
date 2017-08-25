package Savitch;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by esickert on 8/17/2017.
 * This little program reads from a file
 */
public  class TheScannerClass {
@Test
    public static void main(String[] args)  {
//    @Test
 //   public void printFilleToScreen()    {
//        String filename = "c:\\tmp\\sam.txt";
        System.out.println("Please enter a path to the file: ");
        Scanner filePath = new Scanner(System.in);
        String filename = filePath.nextLine();
        Scanner inputStream = null;
//        System.out.println("The file " + filename + " contains the following lines: \n");

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
}
