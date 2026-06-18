package src.if_else;

import java.util.Scanner;

public class positive_div {
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);

        System.out.print("enter the value: ");
        int n = ud.nextInt();

        
            if(n%3 == 0 && n%5 == 0){
            System.out.println("sursh");
        }


         else
            if(n%5 == 0){
            System.out.println("ramesh");
        }

        else
            if(n%3 == 0){
            System.out.println("kamlesh");
        }

        else
            if(n%5 != 0 && n%3 != 0){
            System.out.println("umesh");
    
        }

        


    }
}
