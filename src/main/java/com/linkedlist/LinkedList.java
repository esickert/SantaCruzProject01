package com.linkedlist;

public class LinkedList {

    private Node head;
    protected int numberOfNodes = 0;

    LinkedList()    {
        head = null;
    }

    public int length() {
        Node position = head;
        int count = 0;
        while (position != null) {
            position = position.getLink();
            count++;
        }
    return count;
    }

    public void addToList(String stuff)  {
        head = new Node(stuff, head);
        numberOfNodes++;
    }


    public void printList() {
        Node position = head;

        while (position != null)    {
            System.out.println(position.getStuff());
            position = position.getLink();
        }
    }

    public void findElement(String target)   {
        Node position = head;
        while (position != null)    {
            if position.getStuff()

        }
    }

}
