package src.recursion;

public class first_occurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,5,6,7};
        int target = 5;

        System.out.println(occ(arr, target));
    }

    public static int occ(int[] arr, int target){
        int n = arr.length;
        return helper(arr, target, 0, n-1);
    }

    public static int helper(int[] arr , int target , int low , int high){
        int mid = (low + high )/2;
         int ind = mid;
        if(low > high) return -1;
        else
            if(arr[mid] == target) {
                int left = helper(arr, target, low, mid - 1);

                if(left != -1) return left;
                else return mid;
            }
            else 
            if(arr[mid] > target) return helper(arr, target, low, mid - 1);
        else
            if(arr[mid] < target) return helper(arr, target, mid + 1, high);
        return ind;
    }  
}
