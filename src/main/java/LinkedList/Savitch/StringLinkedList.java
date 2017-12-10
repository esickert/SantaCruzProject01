package LinkedList.Savitch;

public class StringLinkedList {

    private ListNode head;   //This is confusing

    public StringLinkedList()   {
        head= null;
    }
/**
   displays data on the list
*/
     public void showList() {
         ListNode position = head;
         while (position != null)   {
             System.out.println(position.getData());
             position = position.getLink();
         }
     }//end of method showList()
}
