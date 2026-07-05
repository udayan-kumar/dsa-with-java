package src.recursion;

import java.util.Scanner;

public class fibonacci_number {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();
        System.out.println(feb(n));
    }

    public static int feb(int n){
        if(n==0 || n==1) return n;
        return feb(n-1) + feb(n-2);
    }
}
