package src.if_else;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter number: ");
        int n = ud.nextInt();

        if(n%4==0 || n/400 == 0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
