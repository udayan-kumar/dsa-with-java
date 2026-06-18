package src.if_else;

import java.util.Scanner;

public class terniary_in_veriable {
    public static void main(String[] args) {
       Scanner ud = new Scanner(System.in);

       System.out.print("enter value: ");
       int n = ud.nextInt();

       int udayan = (n>=0) ? 100  :  0;

       System.out.println(udayan);
    }
}
