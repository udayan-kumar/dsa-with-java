package src.methods;

import java.util.Scanner;

public class permutation_and_combination {
    public static int fac(int x){
        int f = 1;
        for(int i =1; i<=x; i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);

        int n = ud.nextInt();
        int r  = ud.nextInt();

        int ncr = fac(n)/((fac(n-r))*fac(r));
        int npr  = fac(n)/fac(n-r);
        System.out.println(ncr + " " + npr);
    }
}
