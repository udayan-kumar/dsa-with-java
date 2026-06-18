package src.pattern_printing;

import java.util.Scanner;

public class alp_row_same {
    public static void main(String[] args){
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();

        for(int i  = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }

    }
}
