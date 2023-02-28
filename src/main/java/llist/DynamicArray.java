package llist;

import java.util.logging.Logger;

class DynamicArray{
    private static final Logger log = Logger.getLogger("InfoLogging");
    StringBuilder print = new StringBuilder();
    int size;
    DynamicArray(){
      size = 0;
    }
    int[] arr;
    
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
        String res =""+print;
        log.info(res);
        print.delete(0, print.length());
    }

}


