package src.recursion;

import java.util.Scanner;

public class print_1_n {

    static int n;
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        n = ud.nextInt();
        // print(1,n);
        print(1);
    }

    public static void print(int x ){
        if(x>n) return;
        System.out.println(x);
        print(x+1 );
    }
}
