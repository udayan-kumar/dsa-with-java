// BINARY SEARCH --> it search the target element in half of the array ,, if target element is lesse than mid element than go left and if target element is greater than mid element than go right and again find mid element;;


package src.binary_search;

public class searching {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12 };
        int n = arr.length;
        int target = 9;
        int low = 0; 
        int high= n-1;

        while(low<high){
            int mid = (low + high)/2;
            if(arr[mid] > target){
                high = mid - 1;
            }
            else 
                if(arr[mid] < target) {
                low = mid + 1;
            }
            else 
                if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else 
                System.out.println(-1);
        }
    }
}