package llist;

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLst{ 
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();  
        int option;
        do{
            log.info("\n1.Insert beginning \n2.Insert at index position \n3.print index element \n4.Remove index element\n5.Print all elements \n6.Clear all element\n7.Exit\nEnter choice: ");
            option = sc.nextInt();
            if(option!=7){
            switch(option){
                case 1:
                // insert a new element
                log.info("Enter number: ");
                list.add(sc.nextInt());
                break;
                case 2:
                // insert at a index position
                log.info("Enter index position: ");
                int index1 = sc.nextInt();
                log.info("Enter value: ");
                int value1 = sc.nextInt();
                list.set(index1, value1);
                break;
                case 3:
                // print element at a index position
                log.info("Enter index position: ");
                int index2 = sc.nextInt();
                log.info(""+list.get(index2));
                break;
                case 4:
                log.info("Enter index position: ");
                int index3 = sc.nextInt();
                list.remove(index3);
                log.info(""+list);
                break;
                case 5:
                //print all elements
                if(list.size() == 0){
                    log.info("Array list is empty.\n");
                }else{
                log.info("Array list: "+list);
                log.info("Size of the array: "+list.size());
                 }
                break;
                case 6:
                // clear all elements
                list.clear();
                log.info("All elements cleared");
                break;
                default:
                log.info("Enter a valid option");        
                }
            }
        }while(option!=7);
    }
}

