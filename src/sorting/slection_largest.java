package src.sorting;

public class slection_largest {
    public static void main(String[] args) {
        int[] arr = {1,0,7,4,0,3,8,0,9};
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1; j++){
                int max = Integer.MIN_VALUE;
                int maxdex = -1;
                if(arr[j] <max){
                    max = arr[j];
                    maxdex = j;

                }
                int temp = arr[i];
                arr[i] = arr[maxdex];
                arr[maxdex ]= temp;
            }
            for(int ele : arr){
                System.out.println(ele + " ");
            }
        }
    }
}
