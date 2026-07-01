package src.binary_search;

public class search_sort_rotate {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3};
        int low = 0; 
        int high  = arr.length-1;
        int target = 10;

        while(low<=high){
            int mid = low  + (high - low)/2;
            if(arr[mid] == target){
                System.out.println(mid);
            }
            else
                if(arr[low]<=arr[mid]){  // low to mid is sorted
                if(arr[low]<=target && target<arr[mid]){
                    high = mid - 1;
                }
                else 
                    low = mid +1;
               
            }
            else 
                if(arr[mid]<= arr[high]){  // mid to high is sorted
                    if(arr[mid]<target && target <= arr[high]){
                        low = mid +1;
                    }
                    else 
                        high = mid -1;
                   
                }
                
        }
        System.out.println();
    
    }
}
