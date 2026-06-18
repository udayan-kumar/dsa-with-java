package src.loop;

import java.util.Scanner;

public class rise_to_the_power {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int a = ud.nextInt();
        int b = ud.nextInt();
        
        int power = 1;

        // for(int i =1; i<=b; i++){
        //     power*=a;
        // }
        // System.out.println(power);
        while(b!=0){
            power*=a;
            b--;
        }
        System.out.println(power);
    }
}
