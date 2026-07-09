package src.merge_sort;

import java.util.*;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        int[] arr1 = {10,20,60,90,120};
        int[] arr2 = {30,40,50,70,100,110,130,140};
        int[] arr3 = new int[arr1.length + arr2.length];
        merge(arr3, arr1, arr2);
        for(int ele: arr3){
            System.out.print(ele + " ");
        }
        System.out.println();
       
       
    }

    public static void merge(int[] arr3, int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]< arr2[j]){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        else 
        {
             arr3[k] = arr2[j];
            j++;
            k++;
        }
        }
       while (i<arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
       }
       while(j<arr2.length){
        arr3[k] = arr2[j];
        j++;
        k++;
       }
    }
}
