package src.recursion;

import java.util.Scanner;


public class a_rise_power_b {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int a = ud.nextInt();
        int b = ud.nextInt();

        System.out.println(pow(a,b));
    }

    public static int pow(int a, int b){
        if(b ==0) return 1;
        int call = pow(a,b/2);
        if(b % 2 ==0) return call*call;
        else return a*call*call;
    }
}
