package src.array;

import src.loop.reverse;

public class rotate_array {
    public static void main(String[] args) {
        // int[] arr = {11,2,3,4,56,64};
        // int secarr = 0;
        // int n = arr.length;
        // int i =0; 
        // int j =n- 1;

        // while(i<j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }
        // for(int ele : arr){
        //      secarr = ele;
            
        // }

        // int thirarr = 0;
        // i = 3;
        // j = 5;

        // while(i<j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }
        // for(int ele : arr ){
        //     thirarr = ele;
        // }

        // i = 0;
        // j =2;
        // while(i<j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }
        // for(int ele : arr){
        //     System.out.println(ele);
        // }
         int [] arr = {11,2,3,4,56,64};
         int n = arr.length;
         
         reverse(arr,0 , 1);
        //  for(int ele : arr){
        //     System.out.print(ele + " ");
        //  }
         reverse(arr, 2 , n-1);
        //  for(int ele : arr){
        //     System.out.print(ele + " ");
        //  }
         reverse(arr, 0, n-1);
        //  for (int ele : arr) {
        //     System.out.print(ele + " ");
        //  }
        udayan(arr);
         
    }

    public static void reverse(int arr[] , int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }

        
        // for(int ele : arr){
        //     System.out.println(ele);
        // }
        
    }
    public static void udayan(int arr []){
        
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
