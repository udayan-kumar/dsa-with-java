package src.pattern_printing;

import java.util.Scanner;

public class floyts_traingle {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();
        int a = 1;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(a + " ");
                a++;

            }
            System.out.println();
        }

        
    }
}
