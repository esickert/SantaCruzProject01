package com.esickert.testcases;

import org.junit.Test;

import java.io.*;

/**
 * Created by esickert on 7/9/2017.
 */
public class Test19 {

/**
* This may make more sense after covering File/IO Chap 10 in savitch's book!!
*/
    @Test
    public void outputFileToSystemOutWithBufferedReader() throws IOException    {

        File inputFile;                                                     //creates an input file??????
        inputFile = writeTheTestDataFile();                                 //this is a custom method writing to an inputFile of class File????

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));;

        try{
            String line;                                                     //creates a variable line of type String
            while((line = reader.readLine())!=null)  {                       //
                System.out.println(line);
            }
        } finally   {
            reader.close();
        }
    }

    //WRITE TO A TEMP FILE
    public File writeTheTestDataFile() throws IOException {
        File outputFile = File.createTempFile("For Reading From", ".erich", new File("c:/Temp")); //a method creates a temp file in c:/Temp using method createTempFile
        PrintWriter print = new PrintWriter(
                                new BufferedWriter(
                                    new FileWriter(outputFile)));
        for(int lineNumber = 1; lineNumber < 6; lineNumber++)    {
            print.println("line " + lineNumber);
        }

        print.close();
        return outputFile;
    }
//***************************************************************************************************************************************************


}  //end of Test19
