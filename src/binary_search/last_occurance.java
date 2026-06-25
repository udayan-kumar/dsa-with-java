package src.binary_search;

import java.util.ArrayList;

public class last_occurance {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = {1,3,5,5,5,5,67,123,125};
        int n = arr.length;
        int target = 5;
        int low = 0;
        int high = n-1;
        int firindex = -1;
        int lasindex = -1;

        while(low < high){
            int mid = (low + high)/2;

            if(arr[mid]< target){
                low = mid +1;
            }
            else 
                if(arr[mid] > target){
                    high = mid -1;
                }
                else 
                    if(arr[mid] == target){
                        firindex = mid;
                        high = mid -1;
                       
                        
                    }
                   

        }
            //   System.out.println(firindex);
            ans.add(firindex);
             
              while(low <= high){
                int mid = (low + high)/2;
                 if(arr[mid]< target){
                low = mid +1;
            }
            else 
                if(arr[mid] > target){
                    high = mid -1;
                }
                else 
                    if(arr[mid] == target){
                      
                          lasindex = mid;
                          low = mid +1;
                        
                        
                    }
              }
            //   System.out.println(lasindex);
            ans.add(lasindex);
            System.out.println(ans);
    }
}
