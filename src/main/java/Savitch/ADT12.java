package Savitch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.LinkedList;
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
            Object[] anArray;

            collect.add(123);
            collect.add(6549);
            collect.add(45);

            System.out.println("FROM WHAT I READ YOU CANNOT 'GET' THE ELEMENTS \n"
                    + " OF A COLLECTION BECAUSE THERE IS NO GUAREENTEE WHICH \n"
                    + " ELEMENT WOULD BE RETURNED AS IT'S A COLLECTION(none ordered elements!! \n");
            //This will convert the collection into an array of objects. Convert the objects to strings
            anArray = collect.toArray();
            for(Object temp: anArray)    //note that the array is of type object.
                System.out.print(temp + "  ");
        }

        @Test
        public void list()  {

            List<String> aList = new ArrayList<String>();
                aList.add("Lions");
                aList.add("in the street");
                aList.add("and roaming");

            System.out.println(aList);  //this prints out the array output.

            for(String temp:aList)
                System.out.println(temp);
        }

        @Test
        public void hashSet() {
            HashSet<Integer> hashMe = new HashSet<>();
            hashMe.add(2);
            hashMe.add(7);
            hashMe.add(7);  //gets ignored
            hashMe.add(3);

//            hashMe.iterator();

            printSet(hashMe);    //method printMe
            hashMe.remove(3);
    //        hashMe.iterator();
            printSet(hashMe);

            System.out.println("System contains 3: " + hashMe.contains(3));
            System.out.println("System contains 7: " + hashMe.contains(7));
        }

        public void printSet( HashSet stuff) {

            System.out.println(stuff);
            for (Object temp : stuff)
                System.out.print("\n" + temp + " ");

        }

        @Test
        public void aMap() {

            HashMap<Integer, String> aMap = new HashMap<>();
            aMap.put(123,"Lions");
            aMap.put(456,"In the street");
            aMap.put(987,"and roaming");
            System.out.println("Contents of aMap at line 104");
            printMap(aMap);
            System.out.println("Is something there?: " + aMap.containsKey("Lions"));
            System.out.println();

            System.out.println("Changing the key of Lions. ");
            aMap.put(666, "Lions");
            System.out.println("Contents of aMap at line 111");
            printMap(aMap);
            System.out.println("The value associated with " + aMap.containsKey(666));
        }

        public void printMap(HashMap<Integer, String> map)   {

            System.out.println("aMap contains:");
            for(Integer temp:map.keySet())   {
                String number = map.get(temp);
                //System.out.println(temp + " is a number: " + number.intValue());

            }
        }
//******************************************************************************
//          LINKEDLIST FOR
        @Test
        public void aLinkedList()   {  //this is not using this correctly!!!!!!!!!

            LinkedList<String> aLinkedList = new LinkedList<>();

            aLinkedList.add("Hello There");
            System.out.println(aLinkedList.get(0));

        }


}

