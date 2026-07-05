package src.recursion;

import java.util.Scanner;

public class decreasing_increasing {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();
        print(n);
    }

    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
        if(n!=1)  // 1 will be printed one time
        System.out.println(n);
    }
}
