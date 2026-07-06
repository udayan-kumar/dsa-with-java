package src.recursion;

public class sum_subset {
    public static void main(String[] args) {
    int[] arr = {1,2,3};
        sub(0, arr, 0);
    }

    public static void sub(int ans, int[] arr, int indx){
        if(indx == arr.length){
            System.out.print(ans + " ");
            return;
        }
        int sum = arr[indx];
         sub(ans + sum, arr, indx+1);
         sub(ans, arr, indx+1);
    }
}
