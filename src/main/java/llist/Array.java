package llist;

import java.util.Scanner;
import java.util.logging.Logger;

class DynamicArray{
    private static final Logger log = Logger.getLogger("InfoLogging");
    StringBuilder print = new StringBuilder();
    int size;
    DynamicArray(){
      size = 0;
    }
    int arr[];
    

    void increase(){
        int temp[] = new int[size+1];
        for(int i = 0; i < size; i++){
            temp[i] = arr[i];
        }
        arr = temp;
        size++;
    }
    
    void insert(int value){
        increase();
        arr[size-1] = value;
    }

    void remove(){
        int temp1[] = new int[size-1];
        for(int i = 0; i < size-1; i++){
            temp1[i] = arr[i];
        }
        arr = temp1;
        size--;
        
    }
    void display(){
        for(int i = 0; i < arr.length; i++){
            print.append(" "+arr[i]+" ");
        }
        log.info(print.toString());
        print.delete(0, print.length());
    }

}


public class Array {
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
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