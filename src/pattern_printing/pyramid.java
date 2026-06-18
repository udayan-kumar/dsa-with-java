package src.pattern_printing;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1 ; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=2*i-1; j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

        // SECOND METHOD

        int nsp = n-1;
        int nst = 1;

        for(int i =1 ; i<=n; i++){
            for(int j =1 ; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j<=nst; j++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
