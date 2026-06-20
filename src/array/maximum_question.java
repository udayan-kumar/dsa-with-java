// print the mximum element in the array

package src.array;

import java.util.Scanner;

public class maximum_question {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);
        
        System.out.print("size of an array: ");
        int n = ud .nextInt();

        int[] arr = new int[n];
        int max = arr[0];
        // int max = Integer.MIN_VALUE; // we can also use this

        System.out.print("enter the element: ");
        for(int i =0; i<n ; i++){
             arr[i] = ud.nextInt();
        }

        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
            
    }


 }

