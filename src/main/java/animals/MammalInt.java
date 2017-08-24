package animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MammalInt implements Animal, Creature  {  //note that we are using 2 interfaces here!;

Dogs poodle = new Dogs();  //declaring an instance of a class inside a class. Poodle will access the varabile and methods of Dogs.


MammalInt() {
    this.poodle.pee();                                                                        //this is composition????
    }

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
        Canines pups   = new Dogs();
        Creature num = new MammalInt();

        dudes.eat();
        System.out.println(dudes.pee());
        dudes.travel();
        System.out.println("How many legs: " + dudes.numOfLegs());
        System.out.println("***************************");

        pups.pee();

        System.out.println("How many legs: " + dudes.numOfLegs());
        int x = num.sum();
        System.out.println(num.sum());

//        assertEquals(dudes.pee(),pups.pee());  //this does not "equal" as one is an integer the other a string.
    }
}



