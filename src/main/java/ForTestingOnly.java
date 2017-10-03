import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class ForTestingOnly {

    private ObjectOutputStream outputStream = null;
    private ObjectInputStream inputStream = null;

        public static void main(String[] args)  {




 //       String filename = "c:/tmp/numbers.dat";
        String y = "";
        String n = "";

        try {

            String filename = connectToInputFile();
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));    //stream classes to output to 123
            // binary files.

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter non negative integers: ");
            System.out.println("Place a negative integer at the end. ");

            int anInteger;
            do {
                anInteger = keyboard.nextInt();
                outputStream.writeInt(anInteger);  //write an integer to the binary file!!!!123456 -1
                outputStream.writeUTF("This is a String in contrast to the previous numbers");
            } while (anInteger >= 0);  //using a negative number to detect end of file.

 //           System.out.println("Numbers and sentinal value");
 //           System.out.println("written to a file " + filename);
            outputStream.close();

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
            int aNumber = inputStream.readInt();
            System.out.println("Is this the number you read in??? "   + aNumber);
            System.out.println("Type y for yes, n for no");
            String x = "";
            x = keyboard.next();
            switch(x)   {
                case "y":
                    System.out.println("Awesome");
                    break;
                case "n":
                    System.out.println("Sorry, I fucked up!!!");
                    break;
                default  :
                    System.out.println("invalid response fuckface!! BYE");
            }
            String stuff = inputStream.readUTF();
            System.out.println(stuff);

            inputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("ERROR-File not found!!!");
        } catch(EOFException e) {
            System.out.println("ERROR-End of file");
        } catch(IOException e) {   //used because <binary stream>.close() will throw a IOException. In contrast to a text file which will NOT.
            System.out.println("Problem with output to file: " );// + filename);
        }

    }  // end of main()

//    @Test
    public static String connectToInputFile() {
        System.out.println("Testing separate test method");

        String inputFileName = getFileName("Enter name of input file: ");
        return inputFileName;
    }

    public static String getFileName(String prompt) {
        String filename = null;
        System.out.println(prompt);
        Scanner keyboard = new Scanner(System.in);
        filename = keyboard.next();
        return filename;
    }









}  //end of class For testing only


