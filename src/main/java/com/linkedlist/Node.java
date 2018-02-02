package com.linkedlist;

import org.junit.Test;

public class Node {

    private String stuff;
    private Node link;

    public Node()   {
        stuff = "stuff";
        link = null;
    }

    public Node(String stuff, Node link)    {
        this.stuff = stuff;
        this.link = link;
    }

    public Node getLink() {
        return link;
    }
    //okay pretty surer these will not work!!
    public Node setLink()    {
        Node head = new Node();
        return head;
    }
//****************************************************************************
    public String getStuff()   {
        return stuff;
    }
                            
    public String setStuff(String newStuff)    {
        stuff = newStuff;
        return stuff;
    }
}
