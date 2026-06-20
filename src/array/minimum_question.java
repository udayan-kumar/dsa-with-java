// print the minimum element in the array

package src.array;

import java.util.Scanner;

public class minimum_question {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n = ud.nextInt();

        int[] arr = new int[n];
        int min =arr[0];
            // int min = Integer.MAX_VALUE;


        System.out.print("enter element of array: ");
        for(int i =0; i<n; i++){
            arr[i] = ud.nextInt();
        }

        for(int i =0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }  
        System.out.println(min);
    }
}
