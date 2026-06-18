package src.if_else;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner ud  = new Scanner(System.in);
        System.out.print("account balance: ");
        int accountbalance = ud.nextInt();

        System.out.print("withdrawal amount: ");
        int amount = ud.nextInt();

        System.out.print("pincode: ");
        boolean pin = ud.nextBoolean();
        
        if(pin == false){
            System.out.println("transection denied: invalid pin");
        }else
            if(pin == true && amount>accountbalance){
                System.out.println("tramsection denied: imsufficient amount");
            }else 
                if(pin == true && amount%100==0){
                    System.out.println("remaining: " + (accountbalance - amount));
                }else{
                    System.out.println("transection denied: machine only dispense 100s");
                }

    }
}
