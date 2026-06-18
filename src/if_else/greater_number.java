package src.if_else;

import java.util.Scanner;

public class greater_number {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter a: ");
        int a = ud.nextInt();

        System.out.print("enter b: ");
        int b = ud.nextInt();

        System.out.print("enter c: " );
        int c = ud.nextInt();

    //     if(a>=b && a>=c){
    //         System.out.println(a);
    //     }
    //     else 
    //         if(b>=a && b>=c){
    //             System.out.println(b);
    //         }
    //         else 
    //             if(c>=a && c>=b){
    //                 System.out.println(c);
    //             }
    if(a>=b){
        if(a>=c) System.out.println(a);
        else System.out.println(c);
    }
    else{
        if(b>=c) System.out.println(b);
        else 
            System.out.println(c);
    }
    }
}


