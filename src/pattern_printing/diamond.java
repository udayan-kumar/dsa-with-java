package src.pattern_printing;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);
        int n = ud.nextInt();
        int nsp = n-1;
        int nst = 1;

        for(int i =1 ; i<=n; i++){
            for(int j = 1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j =1 ; j<=nst; j++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
        nsp =1;
        nst = 2*n-3;
        for(int i = 1; i<=n-1;i++){
            for(int j =1 ; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j =1 ; j<=nst; j++){
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
