package com.esickert.testcases;

import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by esickert on 7/9/2017.
 */
public class Test19 {
//**********************************************************************************************************************
//**********************************************************************************************************************
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
    //setting second parameter to null appends .tmp extension to created file.
        File outputFile = File.createTempFile("For Reading From", null, new File("c:/Temp")); //a method creates a temp file in c:/Temp using method createTempFile
        PrintWriter print = new PrintWriter(
                                new BufferedWriter(
                                    new FileWriter(outputFile)));
        for(int lineNumber = 1; lineNumber < 6; lineNumber++)    {
            print.println("line " + lineNumber);
        }

        print.close();
        return outputFile;
    }
//**********************************************************************************************************************
//**********************************************************************************************************************

    @Test
    public void createATempFile() throws IOException   {

        File outputTemp = File.createTempFile("For testing!!!!~", ".erich", new File("c:/Temp"));  //CREATES A .ERICH FILE IN C:\TEMP
        File[] drives = File.listRoots();  //RETURNS A LIST OF DRIVES ON SYSTEM.
        for(File temp: drives) {
            System.out.print(temp  + " ");
        }
    }

    @Test
    public void writeOutTheRoots() throws IOException   {

        File[] roots = File.listRoots();
        assertTrue(roots.length > 1);

        for(File temp: roots)   {  //the curly brackets arn't necessary for single statements but makes the code easier to read.
            System.out.println(temp.getAbsolutePath());
        }
        System.out.println("********************************************");
        File output = File.createTempFile("for testing absolutePath..ha ha", null,new File("C:/Temp/tmp/tmp"));
        System.out.println(output.getAbsolutePath());  //this will print out the full path for the output file or location of file in directory tree.
    }

    @Test
    public void fileClassStuff() throws IOException, InterruptedException    {

        File fileStuff = new File("c:\\temp\\erichSickert.txt");
        File fileStuff2 = new File("c://temp", System.currentTimeMillis() +" sickertErich.txt");
        File fileStuff3 = new File("c://temp//tmp//", "//tmp//erich.txt");
 //       assertThat(fileStuff.exists(), is(false));
        //System.currentTimeMillis()
        fileStuff.createNewFile();
        fileStuff2.createNewFile();
        fileStuff3.createNewFile();
        String a = fileStuff.getAbsolutePath();
        System.out.println("This is the absolute path for File fileStuff: " + a);
        sleep(5000);

        fileStuff.delete();

        System.out.println("Using getName() method: " + fileStuff3.getName());
    }

    @Test
    public void moreFileClassStuff()  throws IOException  {

        System.out.println(System.getProperty("java.io.tmpdir"));  //this will print out the system temp directory path
        String tempDir = System.getProperty("java.io.tmpdir");
        File aTempFile = Paths.get(tempDir, "erichSickertClaude.txt").toFile(); //this does not ccreate the file, only a ghost
        aTempFile.createNewFile();

    }

    }  //end of Test19
