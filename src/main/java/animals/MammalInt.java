package animals;

import static org.junit.Assert.assertEquals;

public class MammalInt implements Animal {

    public void eat()   {
        System.out.println("Mammal eats");
    }

    public void travel()    {
        System.out.println("Mammal travels");
    }

    public void pee()   {
        System.out.println("Mammal pees");
    }

    public static int numOfLegs()  {
        return 5;
    }


    public static void main(String[] args)  {
        MammalInt dudes = new MammalInt();

        dudes.eat();
        dudes.pee();
        dudes.travel();
        System.out.println("How many legs: " + numOfLegs());
    }
}



