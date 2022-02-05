package LinkedList;

public class removeAtIdx {
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
    public void removeAt(int idx) {
        if (idx < 0 || idx >= size) {
          System.out.println("Invalid arguments");
        } else if (idx == 0) {
            head = tail = null;
        }  else {
          Node temp = head;
          for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
          }
  
          temp.next = temp.next.next;
          size--;
        }
      }
}
}
