// sort --> change array into ascending order

package src.array;

import java.lang.reflect.Array;
import java.util.Arrays;


public class sort_array_builtin {
    public static void main(String[] args) {
    
        int[] arr = {11,23,102,34,405};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
