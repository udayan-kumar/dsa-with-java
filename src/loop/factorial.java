package src.loop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        System.out.print("enter value: ");
        int n = ud.nextInt();

        int fac = 1;

        while(n!=0){
            int digit = n;
            fac*=digit;
            n-=1;
        }
        System.out.println(fac);
    }
}
