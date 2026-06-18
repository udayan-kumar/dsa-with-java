package src.if_else;

import java.util.Scanner;

public class divisiblity_5 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = ud.nextInt();

        if(n % 5 == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
