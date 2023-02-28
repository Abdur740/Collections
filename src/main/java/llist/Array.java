package llist;

import java.util.Scanner;
import java.util.logging.Logger;

public class Array {
    private static final Logger log = Logger.getLogger("InfoLogging");
    void arrayexecution(){
        int value;
        int option;
        Scanner sc = new Scanner(System.in);
        DynamicArray dyarr = new DynamicArray();
        
        do{
        log.info("\n1.Insert Element\n2.Display array\n3.Remove\n4.Exit\nEnter option: ");
        
        option = sc.nextInt();
        if(option !=4){
        switch(option){
        case 1:
        log.info("Enter array element : ");
        value = sc.nextInt();
        dyarr.insert(value);
        break;
        case 2:
        dyarr.display();
        break;
        case 3:
        dyarr.remove();
        break;
        default:
        log.info("Enter valid option\n");
        }
        }
    }while(option !=4);
    }
}