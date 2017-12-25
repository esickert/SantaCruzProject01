package LinkedList.Savitch;


public class ListNode {

    private String data;
    private ListNode link;  //I think I understand this...maybe

    public ListNode() {   //a constructor that creates new instance of ListNode.
        data = null;
        link = null;
    }

    public ListNode(String newData, ListNode linkData) {   // a constructor that creates new instance of ListNode
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

    public ListNode getLink()   {

        return link;
    }

}// end of class ListNode.


