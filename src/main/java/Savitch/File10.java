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
public class File10 implements Serializable {

    @Test
    public void writingTheGreatAmericanNovel() {//throws IOException  {
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
        } catch (Exception e) {
            e.printStackTrace();
        }//creates the file in the directory
    }


    /**
     * Created by esickert on 8/14/2017.
     */
    @Test
    public void writeToFile() {  //this creates file sam.txt and writes to it.

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
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);  //if file does not exist throws IO error.
            System.exit(0);
        } finally {
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

        } catch (FileNotFoundException e) {
            System.out.println("ERROR:Opening the file: " + filename);
            System.exit(0);
        } finally {
            //           if(outStream != null)
            outStream.close();
//        System.getProperty("sam.txt");
        }
    }

    @Test
    public void printFileContentsToScreen() {
        String filename = "c:\\tmp\\rtlSalesKY.txt";
        Scanner inputStream = null;
        System.out.println("The file " + filename + " contains the following lines: \n");

        //   String filename = inputStream.nextLine();
        //   System.out.println(filename);

        try {
            inputStream = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR-trying to open file " + filename);
            System.exit(0);
        }
        {
            while (inputStream.hasNextLine()) {
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

        } catch (FileNotFoundException e) {
            System.out.println("ERROR-File not found");
            System.exit(0);
        } finally {
            textStream.close();
        }

        sleep(5000);

        System.out.println("The contents of " + myFilename + " are: ");
        Scanner inputStream = null;
        try {
            inputStream = new Scanner(new File(myFilename));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR- file not found");
            System.exit(0);
        }
        while (inputStream.hasNextLine()) {
            String line = inputStream.nextLine();
            System.out.println(line);
        }
        inputStream.close();
    }

    @Test
    public void chap10Page795() {    //this needs to be rewritten

        String filename = "c:/tmp/samatha.txt";
        PrintWriter outputStream = null;

        try {
            outputStream = openOutputTextFile(filename);
            outputStream.println("The Secretary of State for war today recieved the following dispatch...");
            outputStream.println("I regret to report a distereous engagment between the armies of the Zulu king...");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR-file not found!!");
            System.exit(0);
        }
        outputStream.close();
    }

    public static PrintWriter openOutputTextFile(String filename) throws FileNotFoundException {

        PrintWriter toFile = new PrintWriter(filename);
        return toFile;
    }

    //**********************************************************************************************************************
//**********************************************************************************************************************
    @Test
    public void csvParse() {    //this works but the arrays are  still fucked up. Indices are weird.

        String filename = "c:/tmp/cellular_short_oneDecade.csv";
        //       String[] anArray = new String[10];
        double num = 0.0;
        double[][] stats = new double[5][10];
//        String[][] stats = new String[5][10];

        int count = 1;

        try {
            Scanner outputStuff = new Scanner(new File(filename));
            String line = outputStuff.nextLine();
            line = outputStuff.nextLine();
//            String anArray0[] = line.split(",");
//            for(int i = 0; i <= anArray0.length-1; i++) {
//                System.out.println(anArray0[i] + " ");
//            }

            while (outputStuff.hasNextLine()) {
                line = outputStuff.nextLine();
                String anArray[] = line.split(",");

                for (int i = 1; i <= anArray.length - 2; i++) {
                    System.out.print(anArray[i] + "  ");
                    num = Double.parseDouble(anArray[i]);

                    stats[count][i] = num;
                    System.out.print(stats[count][i]);

                }
                System.out.println();
                count++;
                num = Double.parseDouble(anArray[1]);
            }  //end of while loop


            System.out.println("\n");
            System.out.println("From String to number: " + num);
            System.out.println();

            stats[1][1] = num;
            System.out.println("From 1D array to 2D array: " + (stats[1][1]));

            outputStuff.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR-file not found");
            System.exit(0);
        }
        for (int i = 0; i <= stats.length - 2; i++) {
            System.out.println();
            for (int j = 0; j <= stats[i].length - 2; j++) {
                System.out.print(stats[i][j] + "  ");
            }
        }
        System.out.println("\n\nIt's me, BoBo!!!");
    }
//**********************************************************************************************************************

    @Test
    public void selfTestPage804() {

        String filename = "c:/tmp/stuff.dat";
        double x1 = 1.00;
        double x2 = 2.12;
        double x3 = 3.123;

        try {
            ObjectOutputStream toFile = (new ObjectOutputStream(new FileOutputStream(filename)));
            toFile.writeInt(123);
            toFile.writeDouble(x1);
            toFile.writeDouble(x2);
            toFile.writeDouble(x3);

            toFile.close();  //need to close the output stream so it writes to file. Stream stored in buffer till then.
        } catch (FileNotFoundException e) {

            System.out.println("ERROR- File not found");
            System.exit(0);
        } catch (IOException e) {
            System.out.println("ERROR-IO exception");
            System.exit(0);
        }

    }


    @Test
    public void writeStringToBinaryFile() {

        String filename = "c:/tmp/binaryErich.dat";

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));
            outputStream.writeUTF("Lions in the street and roaming,\ndogs in heat rabid foaming.\n");

            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR-File not found");
            System.exit(0);
        } catch (IOException e) {
            System.out.println("ERROR");
            System.exit(0);
        }
    }

    @Test
    public void readStringFromBinaryFile() {

        String filename = "c:/tmp/binaryErich.dat";

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
            System.out.println("Reading the contents of binary file " + filename + "\n");
            String aString = inputStream.readUTF();   //binary file contains String, not integer. This is an experiment.
            System.out.println(aString);
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR-file not found");
            System.exit(0);
        } catch (EOFException e) {
            System.out.println("ERROR-reached end of file");
            System.exit(0);
        } catch (IOException e) {
            System.out.println("ERROR-Problem reading file!");
            System.exit(0);
        }
    }

    @Test
    public void questionsP811() {   //this is incomplete. Need to write question 21.

        String filename = "c:/tmp/stuff.dat";

        try {
            ObjectInputStream fromFile = new ObjectInputStream(new FileInputStream(filename));

            int anInteger = fromFile.readInt();
            System.out.println(anInteger);
            double x1double = fromFile.readDouble();
            double x2double = fromFile.readDouble();
            double x3double = fromFile.readDouble();
//            double x4double = fromFile.readDouble();  // will end with a EOFException as there is no fourth double in the file.
            System.out.println(x1double + " " + x2double + " " + x3double + "  Happy Days!!!");

            fromFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found exception");
        } catch (EOFException e) {
            System.out.println("EOFxception occurred");
        } catch (IOException e) {
            System.out.println("ERROR-IO exception");
        }
    }

    @Test
    public void displayInBinaryFile() {

        String filename = "temperature.dat";

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));
            double one = 100.2;
            double two = 98.3;
            double three = 79.1;
            double four = 80.5;

            outputStream.writeDouble(one);
            outputStream.writeDouble(two);
            outputStream.writeDouble(three);
            outputStream.writeDouble(four);

            outputStream.close();

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));

            System.out.println("Writing out the contents of the binary file " + filename);
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readDouble());
//            System.out.println(inputStream.readDouble());  //this will cause an EndOfFileException

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("A EndOfFileException has occurred!!!");
        } catch (EOFException e) {
            System.out.println("A EndOfFileException has occurred!!!");
        } catch (IOException e) {
            System.out.println("An end of file excetion has occurred");
        }

    }

}


