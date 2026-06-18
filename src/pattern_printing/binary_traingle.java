package src.pattern_printing;

import java.util.Scanner;

public class binary_traingle {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

         int n = ud.nextInt();

         for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)% 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
                System.out.println();

         }
    }
}
