package src.recursion;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int a = ud.nextInt();
        int b = ud.nextInt();
        System.out.println(num(a, b));
    }

    public static int num(int a, int b){
        if(a ==0) return b;
        return num(b%a,a);

    }
}
