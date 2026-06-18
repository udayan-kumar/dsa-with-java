package src.if_else;

import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter number: ");
        int n = ud.nextInt();

        // if(n >= 0){
        //     System.out.println(n);
        // }

        // else{
        //     System.out.println(-n);
        // }

        if(n<0){
             n= -n;
            }
        System.out.println(n);
    }
}
