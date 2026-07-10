package src.cyclic_sort;

import java.util.Arrays;

public class sorting_array_recursion {
    public static void main(String[] args) {
         int[] arr = {3,5,9,2,1,4,8,10,6,7};
         cyclic(arr);
         System.out.println(Arrays.toString(arr));
       
    }

    public static void cyclic(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctindex = arr[i] - 1;
            if(arr[i] == arr[correctindex]) i++;
            else {
                swap(arr, i, correctindex);
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
