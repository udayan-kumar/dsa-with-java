package src.recursion;

public class searching_array {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,8,5,9};
        int target = 2;
       System.out.println( axist(arr, 0, target));
    }

    public static boolean axist(int[] arr ,int indx, int target){
        if(indx>=arr.length) return false;
        if(arr[indx] == target) return true;
        return axist(arr, indx+1, target);
    }
}
