package llist;

import java.util.logging.Logger;
class LinkedListopr{
    private static final Logger log = Logger.getLogger("InfoLogging");
    StringBuilder print = new StringBuilder();
    Node head;
  class Node{
     int data;
     Node next;
       Node(int value){
            data = value;
            next = null;
         }
     }
LinkedListopr(){
    head = null;
}
void insert(int data)
{
    Node n1 = new Node(data);
    Node temp = head;
    if(head == null){
        head = n1;
    }
    else{
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = n1;
}
}
void remove(){
    Node temp = head;
    Node prev = temp;
    while(temp.next!=null){
        prev=temp;
        temp = temp.next;
    }
    prev.next=temp.next;
}
    void display(){
        Node temp = head;
        while(temp!=null)
        {
            print.append(" "+temp.data+" ");
            
            temp = temp.next;
        }
        String res =""+print;
        log.info(res);
        print.delete(0,print.length());
    }
}
