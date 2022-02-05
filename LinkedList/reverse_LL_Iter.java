package LinkedList;

/**
 * reverse_LL_Iter
 */
public class reverse_LL_Iter {
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
    private Node getNodeAt(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp;
      }
  
      public void reverseDI() {
        int li = 0;
        int ri = size - 1;
        while(li < ri){
          Node left = getNodeAt(li);
          Node right = getNodeAt(ri);
  
          int temp = left.data;
          left.data = right.data;
          right.data = temp;
  
          li++;
          ri--;
        }
      }
    
}