package src.if_else;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter l: ");
        int l = ud.nextInt();

        System.out.print("enter b: ");
        int b = ud.nextInt();

        int area = l*b;
        int peri = (l + b)*2;

        if(area>peri){
            System.out.println("area is " +area);
            System.out.println("perimeter is " + peri);

            System.out.println("area is greater");
        }
        else{
            System.out.println("area is " + area);
            System.out.println("perimeter is " +peri);
            System.out.println("perimeter is greater");
        }
    }
}
