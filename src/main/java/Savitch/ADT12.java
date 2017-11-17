package Savitch;

import org.junit.Test;

import java.util.*;

public class ADT12 {
//    public static void main(String[] arguments) {

//        anArraylist();

//    }
        @Test
        public void anArraylist() {

//            Scanner userInput = new Scanner(System.in);
            ArrayList<Integer> cat = new ArrayList<>(20); // new notation as of java 7
            //our arraylist has limit of 20 items;
            System.out.println("Is this true " + cat.add(1));
            cat.add(2);

            for (Integer temp : cat)
                System.out.print("This will print out the contents of the arraylist " + temp + "  \n");

            //System.out.println(cat.set(1, 200));
            for (Integer temp : cat)
                System.out.print("This will print out the contents of the arraylist " + temp + "  \n");

            for(int temp:cat)   {
                System.out.print(temp + "  ");
            }

            System.out.println("Is this arraylist empty??  " + cat.isEmpty());
        }

        @Test
        public void collection()   {

            Collection<Integer> collect = new ArrayList<Integer>();

            collect.add(123);
            System.out.println("Is this correct??? " + collect.get(0));

        }
}
