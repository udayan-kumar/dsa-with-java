// print sum of element of the array

package src.array;

import java.util.Scanner;

public class sum_question {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter array size: ");
         int n = ud.nextInt();

         int sum = 0;

        int[] arr = new int[n]; 
         System.out.print("enter array element: ");
        for(int i =0; i<n; i++){
            arr[i] = ud.nextInt();
            
        }
        for(int i =0; i<n; i++){
            sum+=arr[i];
        }
            System.out.println(sum);

        
    }
}
