package src.recursion;

import java.util.Scanner;

public class nth_stair {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();
        System.out.println(stair(n));
    }

    public static int stair(int n){
        if(n == 1 || n == 2) return n;

        return stair(n-1) + stair(n-2);
    }
}
