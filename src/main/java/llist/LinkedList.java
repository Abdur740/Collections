package llist;

import java.util.logging.Logger;
import java.util.Scanner;

class LinkedList{
    private static final Logger log = Logger.getLogger("InfoLogging");
    void linkedlistexecution(){
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