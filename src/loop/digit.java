package src.loop;

import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the value: ");
        int n = ud.nextInt();
        // if(n == 0) n=1;

        int count = 0;
        while(n!=0){
            n/=10;
            count++;
        }
            System.out.println(count);



    }
}
