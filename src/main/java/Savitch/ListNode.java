package Savitch;

import org.junit.Test;


public class ListNode {

    private String data;
    private ListNode link;

    public ListNode() {
        data = null;
        link = null;
    }

    public ListNode(String newData, ListNode linkData) {
        data = newData;
        link = linkData;
    }

    public void setData(String newData) {
        data = newData;
    }

    public String getData() {
        return data;
    }

    public void setLink(ListNode newLink)  {
        link = newLink;
    }

}


