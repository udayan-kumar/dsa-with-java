package src.loop;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int rev = 0;
        Scanner ud = new Scanner(System.in);
        System.out.print("enter the value: ");
        int n = ud.nextInt();

        while(n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }
        System.out.println(rev);

    }
}
