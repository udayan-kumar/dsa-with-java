package src.loop;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int a = ud.nextInt();
        int b = ud.nextInt();
        int ans = 0;

        for(int i = 1; i<a;i++){
            if(a%i ==0 && b %i ==0){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
