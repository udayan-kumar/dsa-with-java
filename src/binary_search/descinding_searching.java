package src.binary_search;

public class descinding_searching {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        
        int low  = 0; 
        int high = arr.length-1;
        int target = 6;
        int index = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] < target){
                 high = mid -1;
            }
            else 
                if (arr[mid] > target){
                    low = mid +1;
                }
                else 
                    if(arr[mid] == target){
                        index = mid;
                        high = mid -1;
                    }
        }
        System.out.println(index);
    }
}
