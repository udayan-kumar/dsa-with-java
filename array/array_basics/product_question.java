// print product of an array

package src.array;

import java.util.Scanner;

public class product_question {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        int product = 1;

        System.out.print("enter size of array: ");
        int n = ud.nextInt();
        int[] arr = new int[n];

        System.out.print("enter element of array: ");
        for(int i =0; i<n; i++){
            arr[i] = ud.nextInt();

        }

        for(int i =0; i<n; i++){
            product*=arr[i];

        }
        System.out.println(product);

    }
}
