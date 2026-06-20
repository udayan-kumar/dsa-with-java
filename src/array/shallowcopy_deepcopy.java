// shallocopy means we can access any array with two different variable ,, this is happens in array variable not in normal variable

// deep copy means we can't access any array variable with two different variable like shallowcopy,, 

package src.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class shallowcopy_deepcopy {
    public static void main(String[] args) {
        //  shallowcopy

        // int[] arr = {22,31,4,56,77};
        // int[] x = arr;  // 4 bytes lta hai ye

        // x[0] = 405;

        // System.out.println(arr[0]);


        // deepcopy

        int[] arr = {22,32,41,35};
        int [] y = Arrays.copyOf(arr,arr.length);  // deep copy

        y[0] = 2023 ;

        System.out.println(arr[0]);

    }
}
