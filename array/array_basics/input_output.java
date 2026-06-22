package src.array;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in );

        // int[] arr = {1,2,3,4,5,6,7,8,9,10}; // length = 6
        // // System.out.println(arr.length);
        // int n = arr.length;
        // for(int i =0; i<n; i++){
        //     System.out.println(arr[i]);
        // }

        int[] udayan = new int[7]; 
        // // default value 0
        // for(int i = 0; i<7; i++){
        //     System.out.print(udayan[i] + " ");
        // }

        // input 

        for(int i =0; i<7; i++){
            udayan[i] = ud.nextInt();
        }

        // print 
        for(int i =0; i<7; i++){
            System.out.println(udayan[i] * 2);  // array will be multiply with 2
        }
    }
}
