package animals;

import static org.junit.Assert.assertEquals;

public class MammalInt implements Animal {

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


    public static void main(String[] args)  {
        Animal dudes = new MammalInt();
        Animal pups   = new Dogs();

        dudes.eat();
        System.out.println(dudes.pee());
        dudes.travel();
        System.out.println("How many legs: " + dudes.numOfLegs());
        System.out.println("***************************");
        pups.eat();
        pups.pee();
        pups.travel();
        System.out.println("How many legs: " + pups.numOfLegs());
    }
}



