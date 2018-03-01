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

    public void isEmpty() {
        if (head == null)
            System.out.println("The list is empty");
        else
            System.out.println("The list is not empty");
    }

    public Boolean found(String stuff)  {
        Boolean result = search(stuff);
        System.out.println(search(stuff));
        return result;
    }

    public Boolean search(String justStuff)  {
        Node position = head;
        Boolean result = false;
        while ((position != null))   {
            if (position.getStuff().equals(justStuff)) {
                result = true;
                position = null;
            }
            else {
                position = position.getLink();
            }
        }
        return result;
    }


}





