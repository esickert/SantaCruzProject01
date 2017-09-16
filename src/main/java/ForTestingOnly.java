import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ForTestingOnly {
    public static void main(String[] args)  {
        String filename = "c:/tmp/numbers.dat";
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));    //stream classes to output to 123
            // binary files.

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter non negative integers: ");
            System.out.println("Place a negative integer at the end. ");

            int anInteger;
            do {
                anInteger = keyboard.nextInt();
                outputStream.writeInt(anInteger);  //write an integer to the binary file!!!!
            } while (anInteger >= 0);

            System.out.println("Numbers and sentinal value");
            System.out.println("written to a file " + filename);
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR-File not found!!!");
        } catch (IOException e) {   //used because <binary stream>.close() will throw a IOException. In contrast to a text file which will NOT.
            System.out.println("Problem with output to file: " + filename);
        }

    }
}


