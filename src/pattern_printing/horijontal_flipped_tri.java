package src.pattern_printing;

import java.util.Scanner;

public class horijontal_flipped_tri {
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);
        int n = ud.nextInt();

        for(int i = 0; i<n; i++){
            for(int s = 1; s<=i; s++){
                System.out.print("  ");
            }
            for(int j=n; j>i; j--){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
