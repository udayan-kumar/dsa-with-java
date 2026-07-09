package src.merge_sort;

public class merge_two2_array {
    public static void main(String[] args) {
        int[] arr1 = {1,3,7,9,10};
        int[] arr2 = {2,4,5,6,8};
        int[] arr3 = new int[arr1.length + arr2.length];
        
        
        int i =0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
         while(i<arr1.length){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            while(j<arr2.length){
                arr3[k] = arr2[j];
                j++;
                k++;
            }
            for(int ele : arr3){
                System.out.print(ele+ " ");
            }
        
    }


}
