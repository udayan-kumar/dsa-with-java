package src.recursion;

import java.util.Scanner;

public class print_n_1 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();
        print(n);
    }

    public static void print(int n){
        if(n==0) return;  // base case
        //   System.out.println(n);  // print n to 1  // work
        print(n-1);  // call
         System.out.println(n);  // print 1 to n  // work
    }
}
