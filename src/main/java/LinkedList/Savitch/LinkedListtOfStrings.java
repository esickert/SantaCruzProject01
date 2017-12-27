package LinkedList.Savitch;

import java.util.*;

public class LinkedListtOfStrings {
    public static void main(String[] args)  {

        StringLinkedList linked = new StringLinkedList();

        linked.addNodeToStart("Lions in the street and roaming");
        linked.addNodeToStart("Dogs in heat rebid foaming");
        linked.addNodeToStart("A beast caged in the heart of the city");
        linked.addNodeToStart("Its' mother lying in the summer ground,");
        linked.showList();
         //this will now reference a memory link to the next node.....
        System.out.println(linked.length());
        linked.showList();
       
    }
}
