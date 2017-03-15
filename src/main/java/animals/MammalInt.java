package animals;

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

    public int numOfLegs()  {
        return 0;
    }

    public static void main(String[] args)  {
        MammalInt dudes = new MammalInt();

        dudes.eat();
        dudes.pee();

    }
}


