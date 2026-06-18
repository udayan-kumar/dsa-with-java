package src.pattern_printing;

import java.util.Scanner;

public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int row = ud.nextInt();
        int colo = ud.nextInt();

       for(int i = 1; i<=row; i++){
        for(int j = 1; j<=colo; j++){
            if(i==1 || i==row || j==1 || j==colo){
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
