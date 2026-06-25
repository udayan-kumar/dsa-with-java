package src.binary_search;

public class max_pos_neg {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-1,1,2,3};
        int pocount = 0;
        int necount = 0;
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid  = (low + high)/2;
            if(arr[mid +1] < 0  ){
                high = mid -1;
                

            }
            else 
                if(arr[mid-1] > 0 ){
                    low = mid +1;
                   
                }
                else 
                    if(arr[mid] > 0){
                        pocount++;
                    }
                    else 
                        if(arr[mid] < 0){
                            necount++;
                        }
        }
        if(pocount>necount){
            System.out.println(pocount);
        }else 
            if(pocount<necount)
            {System.out.println(necount);}

    }
}
