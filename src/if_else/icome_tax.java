package src.if_else;

import java.util.Scanner;

public class icome_tax {
    public static void main(String[] args) {
        Scanner ud  = new Scanner(System.in);

        System.out.print("enter amount: ");
        double n = ud.nextDouble();
        if(n<=30000){
            double c = (30000-n)*0;
            System.out.println("no tax " + c);
        }
        else if(n>30000 && n<=70000){
            double a = ((n - 30000)*15)/100;
            System.out.println("tax value: " +a);
        }else if(n>70000){

                double b = (((n-70000)*25)/100);
                System.out.println( "tax value: " + b);
            }

        // System.out.print(5678);
        // Scanner ud = new Scanner(System.in);
        // double n = ud.nextDouble();

        // if(n<=30000){
        //     System.out.print("less than n");
        // }
        // else if(n>30000 && n<70000 ){
        //     System.out.print("between than n");
        // }
        // else if(n>70000 ){
        //     System.out.print("greater than n");
        // }
    }
}
