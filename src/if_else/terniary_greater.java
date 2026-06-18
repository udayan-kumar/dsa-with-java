package src.if_else;

import java.util.Scanner;

public class terniary_greater {
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);

        System.out.print("enter the value of a: ");
        int a = ud.nextInt();

        System.out.print("enter the value of b: ");
        int b = ud.nextInt();

        System.out.print("enter the value of c: ");
        int c = ud.nextInt();

        System.out.println((a>=b) ? (a>=c ? a :c) : (b>=c ? b :c));


    }
}
