package Savitch;



import java.io.*;

public class ClassSpeciesIODemo {
    public static void main(String[] parameters) {

        ObjectOutputStream outputStream = null;
        String filename = "/tmp/Species.records";

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filename));
        } catch (IOException e) {
            System.out.println("ERROR-error opening file " + filename);
            System.exit(0);
        }

        Species californiaCondor = new Species("California Condor", 27, 0.02);
        Species blackRhino = new Species("Black Rhino", 100, 1.0);

        try {
            outputStream.writeObject(californiaCondor);  //californiaCondor is variable of type Species
            outputStream.writeObject(blackRhino);        //blackRhino is of type Species (a class)
            outputStream.close();
        } catch (IOException e) {
            System.out.println("ERROR writing to file " + filename);
            System.exit(0);
        }
        System.out.println("Records sent to file " + filename);
        System.out.println("Now let's reopen the file and echo the records");


    ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream(filename));
        }
        catch(IOException e) {
            System.out.println("ERROR-opening input file " + filename);
            System.exit(0);
        }

        Species readMeFirst = null;
        Species readMeSecond = null;

        try
        {
            readMeFirst = (Species)inputStream.readObject();   //NOTE TYPECASTING WITH SPECIES
            readMeSecond = (Species)inputStream.readObject();
            inputStream.close();
        }
        catch(IOException e)
        {
            System.out.println("ERROR-problem reading from input file " + filename);
            System.exit(0);
        }
        catch(ClassNotFoundException e)
        {
            System.out.print("ERROR- class not found");
        }
        System.out.println("The following were read from");
        System.out.println("the binary file " + filename + ":");

        System.out.println(readMeFirst);
        System.out.println();
        System.out.println(readMeSecond);
    }
}


