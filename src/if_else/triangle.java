package src.if_else;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter a: ");
        int a = ud.nextInt();

        System.out.print("enter b: ");
        int b = ud.nextInt();

        System.out.print("enter c: ");
        int c = ud.nextInt();

        if((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.println("side of a traingle");
        }
        else{
            System.out.println("not a side of a traingle");
        }



    }
}
