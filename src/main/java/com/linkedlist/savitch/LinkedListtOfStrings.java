package com.linkedlist.savitch;

public class LinkedListtOfStrings {
    public static void main(String[] args)  {

        StringLinkedList linked = new StringLinkedList();

        linked.addNodeToStart("Lions in the street and roaming");

        linked.showList();
         //this will now reference a memory link to the next node.....
        System.out.println(linked.length());
        linked.showList();
        System.out.println(linked.findOnList("hello"));
        linked.findOnList("star wars");
        linked.showList(); //this is wrong
    }
}
