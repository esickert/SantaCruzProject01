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

    public void pee()   {
        System.out.println("Mammal pees");
    }

    public int numOfLegs()  {
        return 5;
    }


    public static void main(String[] args)  {
        Animal dudes = new MammalInt();
        Animal pups   = new Dogs();

        dudes.eat();
        dudes.pee();
        dudes.travel();
//        System.out.println("How many legs: " + numOfLegs());
        System.out.println("***************************");
        pups.eat();
        pups.pee();
        pups.travel();
//        System.out.println("How many legs: " + numOfLegs());
    }
}



