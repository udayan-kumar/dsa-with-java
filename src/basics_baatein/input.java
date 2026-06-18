package src.basics_baatein;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //  Scanner square = new Scanner(System.in);

        // System.out.print("Enter Number: ");
        // double number = square.nextDouble();
        // double num = number * number;
        // System.out.print("SQARED VALUE: ");
        // System.out.println(num);

        // Scanner udayan = new Scanner(System.in);

        // System.out.print("enter first number: ");
        // int one = udayan.nextInt();

        // System.out.print("enter second number: ");
        // int two = udayan.nextInt();

        // System.out.print("enter third number: ");
        // int three = udayan.nextInt();

        // System.out.print("result: ");
        // System.out.println(one + two + three);

        Scanner si = new Scanner(System.in);

        System.out.print("principal: ");
        double p = si.nextDouble();

        System.out.print("rate: ");
        double r = si.nextDouble();

        System.out.print("time: ");
        double t = si.nextDouble();

        System.out.print("result: ");
        System.out.println(p * r * t / 100);

    }
}
