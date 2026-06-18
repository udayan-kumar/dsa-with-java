package src.pattern_printing;

import java.util.Scanner;

public class odd_number_traingle {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int n = ud.nextInt();
        

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
       
    }
}