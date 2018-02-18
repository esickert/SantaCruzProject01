package com.linkedlist;

public class TheListItself {
    public static void main(String[] args)  {

    LinkedList list = new LinkedList();


    System.out.println(list.length());
    //list.addToList("junk");
    System.out.println(list.length());
    list.printList();
    for(int i = 0; i <= 3; i++) {
          list.addToList("more junk");
    }
    list.printList();
//    System.out.println("The number of nodes is " + list.numberOfNodes);
    System.out.println(list.length());

    list.isEmpty();

    }
}
