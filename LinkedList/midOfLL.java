package LinkedList;

public class midOfLL {
    public static class Node {
        int data;
        Node next;
      }
    
      public static class LinkedList {
        Node head;
        Node tail;
        int size;
      
        public int midVal (Node head){
            Node slow = head;
            Node fast = head;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow.data;
        }
    }

}
