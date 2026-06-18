package src.pattern_printing;

import java.util.Scanner;

public class number_square {
     public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);
        int n = ud.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}