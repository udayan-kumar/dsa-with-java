package src.if_else;


import java.util.Scanner;
public class terniary {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter number: ");
        int n = ud.nextInt();

        System.out.println((n%2==0) ? "even" : "odd");
    }
}
