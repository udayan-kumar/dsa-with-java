package src.pattern_printing;

import java.util.Scanner;

public class star_plus {
    public static void main(String[] args){
         Scanner ud = new Scanner(System.in);

        int n = ud.nextInt();

        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=n; j++){
                if(i == (n+1)/2 || j == (n+1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
