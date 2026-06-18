package src.if_else;

import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);

        System.out.print("enter the value: ");
        int n = ud.nextInt();

        if(n<69 && n>0){
            System.out.println("yes");
        }
         else
            if(n>69){
            System.out.println("no");
        }
        else 
            if(n<0 && -n<69){
            System.out.println(-n);
            System.out.println("true");
           
        }
        else{
            System.out.println(-n);
            System.out.println("false");
        }

        
    }
}
