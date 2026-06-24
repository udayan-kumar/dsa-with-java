package src.sorting;

public class kth_smallest {
    public static void main(String[] args) {
        int[] arr = {1,0,7,4,0,3,8,0,9};
        int n = arr.length;
        int k = 4;
        for(int i = 0; i<k ; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j = 0; j<n;j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = mindex;
            mindex = temp;
        }
        System.out.println(arr[k-1]);
    }
}
