package src.pattern_printing;

import java.util.Scanner;

public class alph_traingle {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();

        // for(int i = 1 ; i<=n; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print((char)(i+64) +" ");
        //     }
        //     System.out.println();
        // }
        for(int i = 1 ; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }
    }
}
