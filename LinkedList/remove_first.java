package LinkedList;

public class remove_first {
    public static class Node {
        int data;
        Node next;
      }
    
      public static class LinkedList {
        Node head;
        Node tail;
        int size;
    
    public void remove1st(){
        if(size == 0){
          System.out.println("List is empty");
        } else if(size == 1){
          head = tail = null;
          size = 0;
        } else {
          head = head.next;
          size--;
        }
      }
}
