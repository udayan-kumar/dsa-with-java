package src.recursion;

import java.util.Scanner;

import src.loop.reverse;

public class reverse_number {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();

       reverse(n, 0);
    }

    public static void reverse(int n, int r){
      if (n ==0) {
        System.out.println(r);
        return;
      }
      reverse (n/10,r*10+n%10);
    }
}
