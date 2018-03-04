package com.linkedlist;

import org.junit.Assert;
//import static org.hamcrest.CoreMatchers.is;

public class TheListItself {
    public static void main(String[] args)  {

    LinkedList alist = new LinkedList();

    System.out.println(alist.length());
    //alist.addToList("junk");
    System.out.println(alist.length());
    alist.printList();
    for(int i = 0; i <= 3; i++) {
          alist.addToList("junk");
    }
    alist.printList();
//     System.out.println("The number of nodes is " + alist.numberOfNodes);
    System.out.println(alist.length());

    alist.isEmpty();
    System.out.println("Is the item in the alist? " + alist.found("junk"));


    Assert.assertTrue(alist.found("junk"));
    Assert.assertEquals("Are they equal??", true, alist.found("junk"));

    System.exit(0);

    }
}
