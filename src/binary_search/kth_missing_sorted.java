package src.binary_search;

public class kth_missing_sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,8,9,10};
        int low = 0;
        int high = arr.length-1;
        int k = 2;

       while(low<high){
        int mid = (low + high)/2;
        int correctnum = mid +1;
        int missing = arr[mid] - correctnum;

        if(missing>=k){
            high = mid -1;
        }
        else
         low = mid+1;
       }
         System.out.println(high + 1 +k);

       
    }
}
