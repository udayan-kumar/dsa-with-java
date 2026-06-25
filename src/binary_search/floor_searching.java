package src.binary_search;

public class floor_searching {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,10,12,19};

        int target = 5;
        int low =0; 
        int high = arr.length -1;
        int index = -1;

        while(low <= high){
            int mid = (low + high)/2;
           if(arr[mid] > target){
            high = mid -1;
           }
           if(arr[mid] <= target){
            index = mid;
            low = mid  +1;

           }
        }
         System.out.println(index);

    }
}
