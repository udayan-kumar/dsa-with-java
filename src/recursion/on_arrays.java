package src.recursion;

public class on_arrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,8,5,9};
         recarr(arr, 0);
    }

    public static void recarr(int[] arr, int indx){
        if(indx == arr.length) return;
        // System.out.println(arr[indx]);
        recarr(arr, indx+1);
        System.out.println(arr[indx]);
    }
}
