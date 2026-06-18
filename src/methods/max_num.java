package src.methods;

import java.util.Scanner;


public class max_num {
    public static void main(String[] args) {
        
        Scanner ud = new Scanner(System.in);

        double a = ud.nextDouble();
        double b = ud.nextDouble();
        double c = ud.nextDouble();
        double f = ud.nextDouble();

        // double d = Math.max(a,b);
        // double e = Math.max(d,c);
        //     System.out.println(e);
        
        System.out.println(Math.max(Math.max(Math.max(a,b),c),f));
    }
    
    
}
