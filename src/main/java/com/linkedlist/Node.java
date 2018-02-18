package com.linkedlist;

import org.junit.Test;

public class Node {

 String stuff = "";
 Node link = null;

 Node() {
 }

 Node(String newStuff, Node newLink)    {
     this.stuff = newStuff;
     this.link = newLink;
 }

 public void setStuff(String newStuff)  {
     stuff = newStuff;
 }

 public String getStuff()   {
     return stuff;
 }

 public void setLink(Node newLink)  {
     link = newLink;
 }

 public Node getLink()  {
     return link;
 }

}
