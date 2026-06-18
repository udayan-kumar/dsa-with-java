package src.if_else;

import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter number: ");
        double n = ud.nextDouble();
        int x = (int)n;

        if(n-x > 0) {
            System.out.println("not an integer");
        }
        else{
            System.out.println("integer");
        }
    }
}
