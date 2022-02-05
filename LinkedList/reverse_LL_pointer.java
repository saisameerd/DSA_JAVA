package LinkedList;

/**
 * reverse_LL_pointer
 */
public class reverse_LL_pointer {
    public static class Node {
        int data;
        Node next;
      }
    
      public static class LinkedList {
        Node head;
        Node tail;
        int size;
    
        void addLast(int val) {
          Node temp = new Node();
          temp.data = val;
          temp.next = null;
    
          if (size == 0) {
            head = tail = temp;
          } else {
            tail.next = temp;
            tail = temp;
          }
    
          size++;
        }
    public void reversePI(){
        if(size <= 1){
          return;
        }
  
        Node prev = null;
        Node curr = head;
        while(curr != null){
          Node next = curr.next;
          
          curr.next = prev;
          prev = curr;
          curr = next;
        }
  
        Node temp = head;
        head = tail;
        tail = temp;
      }
    }
    
}