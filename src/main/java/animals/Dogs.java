package animals;

/**
 * Created by esickert on 3/21/2017.
 */
public class Dogs implements Animal {

    @Override
    public void eat() {
        System.out.println("Im in Dogs now to eat");

    }

    public void travel()    {
        System.out.println("Im in Dogs now to travel");
    }

    public String pee()   {
        return "Im in Dogs to pee";
    }

    public int numOfLegs()  {
        return LEGS;
    }

}
