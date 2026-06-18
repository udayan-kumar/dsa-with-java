package src.if_else;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the value x: ");
        int x = ud.nextInt();

        System.out.print("enter the value y: ");
        int y = ud.nextInt();

        if(x>0 && y>0){
            System.out.println("first quadrant");
        }

        else 
            if(x <0 && y >0){
                System.out.println("second quadrant");
            }
            else 
                if(x <0 && y <0){
                    System.out.println("third quadrant");
                }
                else 
                    if(x >0 && y <0){
                        System.out.println("fourth quadrant");
                    }
                    else 
                        if(x == 0 && y == 0){
                            System.out.println("origin");
                        }
                        else 
                            if(x == x && y == 0){
                                System.out.println("lie on x-axis");
                            }
                            else 
                                if(x == 0 && y == y){
                                    System.out.println("lie on y-axis");
                                }
    }
}
