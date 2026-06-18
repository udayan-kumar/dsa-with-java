package src.loop;

import java.util.Scanner;

public class composite {
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();

        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println("composite number");
                break;
            }else{
                System.out.println("prime number");
                break;
            }
        }
    }


}
