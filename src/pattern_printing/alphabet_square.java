package src.pattern_printing;

import java.util.Scanner;

public class alphabet_square {
     public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);
        int n = ud.nextInt();
        

        // if(n<27){
        //     for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         System.out.print((char)(j+64) + " ");
        //     }
        //     System.out.println();
        // }
        // }

        if(n<27){
            for(int i = 1; i<=n;  i++){
                for(int j = 1; j<=n; j++){
                    System.out.print((char)(j+96) + " ");
                }
                System.out.println();
            }
        }
    }
}