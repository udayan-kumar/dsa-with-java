package src.loop;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        System.out.print("enter value: ");
        int n = ud.nextInt();

        for(int i =1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println(i);
                System.out.println(n/i);
            }
            
        }
    }
}
