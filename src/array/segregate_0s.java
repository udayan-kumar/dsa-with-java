// segregate --> first find all 0 in the array and write them first and after that write all non zero element..

package src.array;

import src.if_else.absolute_value;

public class segregate_0s {
    public static void main(String[] args) {
        int[] arr = {0,1,3,0,5,0,0,10};
        int n = arr.length;
        
        // int numzeros = 0;
        // int numone = 0;

        // for(int ele : arr){
        //     if(ele == 0) numzeros++;
        //     else numone++;
        // }

        // for (int i = 0; i<numzeros; i++){
        //     arr[i] = 0;
        //     System.out.print(arr[i] + " ");
        // }

        // for(int i = numzeros; i<arr.length; i++){
        //     arr[i] = 1;
        //     System.out.print(arr[i] + " ");
        // }
        for(int ele : arr){
            if (ele == 0){
                System.out.print(ele + " ");
            }
        }
        for(int ele : arr){
            if (ele != 0){
                System.out.print(ele + " ");
            }
        }
       

        
        
    }
            
}

