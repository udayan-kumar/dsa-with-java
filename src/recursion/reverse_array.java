package src.recursion;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rev(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int rev(int[] arr ,int low , int high){
        if(low > high) return -1 ;
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        return rev(arr, low +1, high-1);
    }
}
