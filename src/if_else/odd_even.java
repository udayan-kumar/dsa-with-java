package src.if_else;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner ud = new  Scanner(System.in);

        System.out.print("Enter number: ");
        int n = ud.nextInt();

        if(n%2 == 0) {
            System.out.println("even number");
            System.out.println("aditya and mukul");
        }

        else {
            System.out.println("odd number");
            System.out.println("ramesh and suresh");
        }
    }

}
