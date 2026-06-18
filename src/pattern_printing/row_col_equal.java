package src.pattern_printing;

import java.util.Scanner;

public class row_col_equal {
     public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);

        int row = ud.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=row; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}