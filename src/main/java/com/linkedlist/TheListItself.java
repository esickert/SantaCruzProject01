package com.linkedlist;

public class TheListItself {
    public static void main(String[] args)  {

        LinkedList list = new LinkedList();

        System.out.println(list.length());

        list.addToList( "chair");
        list.addToList( "chair");
        list.addToList( "chair");

        list.showList();
        System.out.println(list.length());
        list.deleteFirstNode();
        list.showList();
        System.out.println(list.length());


    }
}
