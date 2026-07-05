package src.recursion;

import java.util.Scanner;

public class sum_upto_n {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n ==0) return 0;
        int add = n + sum(n-1);
       return( add);
    }
}
