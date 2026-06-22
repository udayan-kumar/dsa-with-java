// print negative element only

package src.array;

import java.util.Scanner;

public class output_question {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter array size: ");
        int n = ud.nextInt();
        int[] arr = new int[n];

         System.out.print("enter array element: ");

        for(int i =0; i<n; i++){
           arr[i] = ud.nextInt();

        }

        // printing negative number 
           for(int i =0; i<n; i++){
            if(arr[i]<0)
                System.out.println(arr[i] + " ");
           }
        // System.out.println(udayan[] * (-1));
    }
}
