package src.loop;

import java.util.Scanner;

public class sequences {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter value: ");
        int n = ud.nextInt();
        
        for(int i = n; i<=n;i++){
          System.out.println("1");

          
        }
        for(int i = n; i<=n;i++){
          System.out.println(i);

          
        }
        for(int i = n;i<=n;i++){
            System.out.println("2");
        }
        for(int i = n;i<=n;i++){
            System.out.println(i-1);
        }
        for(int i = n;i<=n;i++){
            System.out.println("3");
        }
        for(int i = n;i<=n;i++){
            System.out.println(i-2);
        }


    }
}
