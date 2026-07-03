package src.strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        String str = ud.next();

        int low = 0;
        int high = str.length()-1;

        while(low<high){
            if(str.charAt(low) == str.charAt(high)){
                System.out.println("palindrome");
                
            }
            else {
                System.out.println("not a apalindrome");
                break;
                
            }
                 low++;
                 high--;
           
        }
    }
}
