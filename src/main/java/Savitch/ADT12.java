package Savitch;

import org.junit.Test;

import java.util.*;

public class ADT12 {
//    public static void main(String[] arguments) {

//        anArraylist();

//    }
        @Test
        public void anArraylist() {

            Scanner userInput = new Scanner(System.in);
            ArrayList<Integer> dog = new ArrayList<>(20); // new notation as of java 7
            //our arraylist has limit of 20 items;
            System.out.println("Is this true " + dog.add(1));
            dog.add(2);

            for (Integer temp : dog)
                System.out.print("This will print out the contents of the arraylist " + temp + "  \n");

            //System.out.println(cat.set(1, 200));
            for (Integer temp : dog)
                System.out.print("This will print out the contents of the arraylist " + temp + "  \n");

            for(int temp:dog)   {
                System.out.print(temp + "  ");
            }

            System.out.println("Is this arraylist empty??  " + dog.isEmpty());
        }

        @Test
        public void collection()   {

            Collection<Integer> collect = new ArrayList<Integer>();

            collect.add(123);


            System.out.println("FROM WHAT I READ YOU CANNOT GET THE ELEMENTS \n"
                    + " OF A COLLECTION BECAUSE THERE IS NO GUAREENTEE WHICH \n"
                    + " ELEMENT WOULD BE RETURNED AS IT'S A COLLECTION(none ordered elements!! \n");
        }

        @Test
        public void list()  {

            List<String> aList = new ArrayList<String>();
                aList.add("Lions");
            System.out.println(aList);
        }
}
