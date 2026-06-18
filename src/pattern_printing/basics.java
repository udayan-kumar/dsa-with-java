package src.pattern_printing;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);

        int row = ud.nextInt();
        int col = ud.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
