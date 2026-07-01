package src.binary_search;

public class max_pos_neg {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,-1,1,2,3,4,5};
        
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid  = (low + high)/2;
           if(arr[mid]>=0){
            high = mid -1;
           }
           else 
            if(arr[mid]<0){
                low = mid +1;
            }
        }
       System.out.println(low);

       low =0;
       high = arr.length-1;

       while(low<high){
        int mid = low + (high - low)/2;

        if(arr[mid]<=0){
            low = mid +1;
        }
        else 
            if(arr[mid]>0){
                high = low-1;
            }
       }
       System.out.println(arr.length-low);

    }
}
