package LinkedList;

public class AddLast {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

     void addlast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next=null;
            if(size ==0){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }

            size ++;
        }
    }
}
