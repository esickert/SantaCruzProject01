package animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MammalInt implements Animal, Creature  {  //note that we are using 2 interfaces here!;

 @Override
    public void eat()   {
        System.out.println("Mammal eats");
    }

    public void travel()    {
        System.out.println("Mammal travels");
    }

    public String pee()   {
        return "Mammal pees";
    }

    public int numOfLegs()  {
        return LEGS;
    }

    public int sum()    { return 2 + 2; }


    public static void main(String[] args)  {

        Animal dudes = new MammalInt();
        Animal pups   = new Dogs();
        Creature num = new MammalInt();

        dudes.eat();
        System.out.println(dudes.pee());
        dudes.travel();
        System.out.println("How many legs: " + dudes.numOfLegs());
        System.out.println("***************************");
        pups.eat();
        pups.pee();
        pups.travel();
        System.out.println("How many legs: " + pups.numOfLegs());
        int x = num.sum();
        System.out.println(num.sum());

        assertEquals(dudes.pee(),pups.numOfLegs());  //this does not "equal" as one is an integer the other a string.
    }
}



