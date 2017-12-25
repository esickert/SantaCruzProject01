package LinkedList.Savitch;

import java.util.*;

public class LinkedListtOfStrings {
    public static void main(String[] args)  {

        StringLinkedList linked = new StringLinkedList();

        linked.addNodeToStart("Hello");
         //this will now reference a memory link to the next node
        System.out.println(linked.length());
        linked.showList();
    }
}
