package com.linkedlist;

import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

public class TheListItself {
    public static void main(String[] args)  {

    LinkedList list = new LinkedList();


    System.out.println(list.length());
    //list.addToList("junk");
    System.out.println(list.length());
    list.printList();
    for(int i = 0; i <= 3; i++) {
          list.addToList("junk");
    }
    list.printList();
//     System.out.println("The number of nodes is " + list.numberOfNodes);
    System.out.println(list.length());

    list.isEmpty();
    System.out.println("Is the item in the list? " + list.found("junk"));
    Assert.assertEquals(false, list.found("junk"));

//    System.exit(0);

    }
}
