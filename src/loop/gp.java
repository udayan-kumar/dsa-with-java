package src.loop;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int a = ud.nextInt();

         System.out.print("enter the number: ");
        int r = ud.nextInt();

        System.out.print("enter the number: ");
        int n = ud.nextInt();

        for(int i = 1; i<=n;i++ ){
            System.out.println(a);
            a*=r;
        }
    }
}
