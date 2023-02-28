package llist;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean times = false;
        while(times == false){
            log.info("Choose Options\n1. Array\n2.Linkedlist\n3.Exit");
            int option = sc.nextInt();
        if(option ==1){
            Array arrexecution = new Array();
            arrexecution.arrayexecution();
        }
        else if(option ==2){
            LinkedList llexecution = new LinkedList();
            llexecution.linkedlistexecution();
        }
        else if(option ==3){
            times = true;
        }
        else{
            log.info("Enter a valid option.");
        }
        }
        
        
    }    
}
