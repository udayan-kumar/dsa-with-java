package src.if_else;
import java.util.*;
// import java.util.Scanner;
// import javax.lang.model.util.ElementScanner14;

public class profit_loss {
    public static void main(String[] args) {
        Scanner ud = new Scanner (System.in);

        System.out.print("enter cp value: ");
        double cp = ud.nextInt();

        System.out.print("enter sp value: ");
        double sp = ud.nextInt();

        double profit = sp-cp;

        // double value = (sp-cp)/cp;
        double profit_percentage = (profit)/cp;
        // if (sp - cp > 0){
        //     System.out.println("profit");
        //     System.out.println("profit is " +( sp - cp));
        //     // System.out.println("profit percentage is " + value * 100);
        // }

        // if(sp == cp){
        //     System.out.println("value " + (sp - cp));
        //     System.out.println("no loss no profit");
        // }

        // if(sp - cp < 0){
        //     System.out.println("loss");
        //     System.out.println("loss is " +( cp - sp));
        //     // System.out.println("loss percentage is " + ((cp-sp)/cp )* 100);

        // }

        if (sp - cp > 0){
            System.out.println("profit");
            System.out.println("profit is " +( profit));
            System.out.println("profit percentage is " + (profit_percentage)*100);
        }

        else if(sp == cp){
            System.out.println("value " + (sp - cp));
            System.out.println("no loss no profit");
        }

        else if(sp - cp < 0){
            System.out.println("loss");
            System.out.println("loss is " +( cp - sp));
            System.out.println("loss percentage is " + ((cp-sp)/cp )* 100);

        }
        
       
    }
}
