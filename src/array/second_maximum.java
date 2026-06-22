// print the second maximum element in the array

package src.array;

import src.if_else.integer;

public class second_maximum {
    public static void main(String[] args) {
        int[] arr = {11,22,34,52,2};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
           if(arr[i] > max){
             max = arr[i];
             
           }
           
        }
        for(int i =1; i<arr.length; i++){
            if(arr[i] >smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
