package llist;

import java.util.logging.Logger;
import java.util.Scanner;

class LinkedListopr{
    private static final Logger log = Logger.getLogger("InfoLogging");
    node head;
  class node{
     int data;
     node next;
       node(int value){
            data = value;
            next = null;
         }
     }
LinkedListopr(){
    head = null;
}
void insert(int data)
{
    node n1 = new node(data);
    node temp = head;
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
    node temp = head;
    node prev=temp;
    while(temp.next!=null){
        prev=temp;
        temp = temp.next;
    }
    prev.next=temp.next;
}
    void display(){
        node temp = head;
        while(temp!=null)
        {
            String print = temp.data+"";
            log.info(print);
            temp = temp.next;
        }
    }
}

class LinkedList{
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListopr llobj = new LinkedListopr();
        int value;
        int opt;
        do{
        log.info("\n1. Insert\n2. Display\n3. Remove.\n4. Exit\nEnter option: ");
        opt = sc.nextInt();
        if(opt!=4)
        {
        switch(opt){
        case 1:
        log.info("Enter value: ");
        value = sc.nextInt();
        llobj.insert(value);
        break;
        case 2 :
        llobj.display();
        break;
        case 3:
        llobj.remove();
        break;
        default:
        log.info("Invalid option.");
        break;
        }
    }
        }while(opt!=4);
    }
}