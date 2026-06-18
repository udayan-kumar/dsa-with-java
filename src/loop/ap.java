package src.loop;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = ud.nextInt();

        // for(int i = 2; i<=3*n+1;i+=3){
        //     System.out.println(i);
        // }

        // int a = 4, d = 6;
        // for(int i = 1; i<=n; i++){
        //     System.out.println(a+ " ");
        //     a +=d;
        // }

        int a = 99, d = 4;
        for(int i = 1; i>=n; i++){
            
                System.out.println(a + " ");
            a= a-d;
            
        }

        // for(int i = 99; i>=103-4*n;i=i-4){
        //     System.out.println(i);
        // }
    }
}