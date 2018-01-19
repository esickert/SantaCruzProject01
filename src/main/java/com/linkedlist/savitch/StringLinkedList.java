package com.linkedlist.savitch;

public class StringLinkedList {

    private ListNode head;

    public StringLinkedList() {

        head = null;
    }

    public void showList() {
        ListNode position = head;
        while (position != null) {
            System.out.println(position.getLink());   //i added this for testing, Should return null
            System.out.println("This is the data = " + position.getData());
            position = position.getLink();
        }
    }//end of method showList()


    public int length() {
        int count = 0;
        ListNode position = head;
        System.out.println("position equals " + position.getLink());
        while (position != null) {
            count++;
            position = position.getLink();
        }
        System.out.println("The length of the linkedList is " + count);
        return count;
    }


    public void addNodeToStart(String addData) {
        head = new ListNode(addData, head);
    }


    public void deleteHeadNode() {
        if (head != null)
            head = head.getLink();
        else {
            System.out.println("Deleting from an empty list.");
            System.exit(0);
        }
    }

    public boolean findOnList(String target) {
        return find(target) != null;
    }

    //Returns a reference to the first node containing the
    //target data. If target is not on the list, return null.
    private ListNode find(String target)    {
        boolean found = false;
        ListNode position = head;
        while (position != null && !found) {
            String dataAtPosition = position.getData();
            if (dataAtPosition.equals(target))
                found = true;
            else
                position = position.getLink();
        }
        return position;
    }
}
