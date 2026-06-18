package src.loop;
    import java.util.*;
public class sum_digit {
    public static void main(String[] args) {
        
        int sum = 0;
        Scanner ud  = new Scanner(System.in);
        int n = ud.nextInt();
        
        while( n!=0){
           int digit = n%10;
           sum = sum + digit;
            n/=10;

           
        }
        System.out.println(sum);
    }
}
