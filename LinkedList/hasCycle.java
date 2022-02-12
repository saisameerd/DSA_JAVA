package LinkedList;

public class hasCycle {
    public static class Node {
        int data;
        Node next;
      }
    
      public static class LinkedList {
        Node head;
        Node tail;
        int size;

    public boolean hasCycles(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
            
            
            if(slow == fast) return true;
        }
        
        return false;
        
        
    }
}
}
