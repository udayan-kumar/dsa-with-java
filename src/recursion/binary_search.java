package src.recursion;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,9,10,14};
        int target = 15;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target){
        int n = arr.length;
        return helper(arr, target, 0, n-1);
    }

    public static int helper(int[] arr, int target, int low, int high){
        if(low > high) return -1;
        int mid = (low + high)/2;
        
        if(arr[mid] == target)  return mid;
        else
            if(arr[mid] > target)return helper(arr, target, low, mid -1);
        else
             if(arr[mid] < target) return helper(arr, target, mid + 1, high);
            return helper(arr, target, low, high);
    }
}
