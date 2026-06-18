package src.if_else;

import java.util.Scanner;

public class four_digit {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();

        // if(n>999 && n<100000){
        //     System.out.println("4 digit number");
        // }
        // else{
        //     System.out.println("not a 4 digit number");
        // }

        if(n%5 == 0 || n%3 == 0){
            System.out.println("divisible by 5 or 3");
        }
        else{
            System.out.println("not divisible by 3 0r 5");
        }

    }

}
