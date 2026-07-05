package src.recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();
        System.out.println(fact(n));
        
    }

    public static int fact(int n){
        if(n==0 || n == 1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
}
