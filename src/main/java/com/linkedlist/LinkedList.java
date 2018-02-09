package com.linkedlist;

public class LinkedList {

    private Node head;

    LinkedList()    {
        head = null;
    }

    public void showList()   {
        Node position = head;
        while (position != null)    {
            System.out.println(position.getStuff());
            position = position.getLink();
        }
    } //end of showList() method

    public int length()    {
        int count = 0;
        Node position = head;
        while (position != null)    {
            count++;
            position = position.getLink();
        }
        return count;
    } //end of length() method

    public void addToList(String stuff)  {
        head = new Node(stuff, head);
    } //end of addToList() method

    public void deleteFirstNode() {
        if (head != null)
            head = head.getLink();
        else {
            System.out.println("List is empty");
            System.exit(0);
        }
    }



}
