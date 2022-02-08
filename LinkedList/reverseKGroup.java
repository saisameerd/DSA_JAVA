package LinkedList;

public class reverseKGroup {
    public static class Node {
        int data;
        Node next;
      }
    
      public static class LinkedList {
        Node head;
        Node tail;
        int size;

      public void addLast(int val){
          Node temp = new Node();


          temp.data = val;

          
          temp.next = null;

          if(size == 0){
              head = tail = temp;
          }else{
              tail.next = temp;
              tail = temp;
          }

          size++;
      }
      public void addFirst(int val) {
        Node temp = new Node();
        temp.data =  val   ;
        temp.next = head  ;
        head = temp;
  
        if (size == 0) {
          tail = temp;
        }
  
        size++;
      }
      public void removeFirst() {
        if (size == 0) {
          System.out.println("List is empty");
        } else if (size == 1) {
          head = tail = null;
          size = 0;
        } else {
          head = head.next;
          size--;
        }
      }
  
      public int getFirst() {
        if (size == 0) {
          System.out.println("List is empty");
          return -1;
        } else {
          return head.data;
        }
      }  
      public void kReverse(int k) {
        LinkedList prev = null;
  
        while (this.size > 0) {
          LinkedList curr = new LinkedList();
  
          if (this.size >= k) {
            for (int i = 0; i < k; i++) {
              int val = this.getFirst();
              this.removeFirst();
              curr.addFirst(val);
            }
          } else {
            int sz = this.size;
            for (int i = 0; i < sz; i++) {
              int val = this.getFirst();
              this.removeFirst();
              curr.addLast(val);
            }
          }
  
          if (prev == null) {
            prev = curr;
          } else {
            prev.tail.next = curr.head;
            prev.tail = curr.tail;
            prev.size += curr.size;
          }
        }
  
        this.head = prev.head;
        this.tail = prev.tail;
        this.size = prev.size;
      }
    } 
}
