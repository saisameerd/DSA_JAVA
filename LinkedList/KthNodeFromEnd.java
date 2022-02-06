package LinkedList;

public class KthNodeFromEnd {
    public static class Node {
        int data;
        Node next;
      }
    
      public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public int Kthfromlast(int idx){
         Node fast = head;
         Node slow = head;

         for (int i = 0; i < idx; i++) {
            fast = fast.next;
          }
    
          while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
          }
    
          return slow.data;
        }
      }
     
    
}
