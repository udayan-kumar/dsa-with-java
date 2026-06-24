package src.sorting;

public class bubble_sort_descinding {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5,3,6,7,5,8};
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
        boolean ischecked = true;

            for(int j = 0; j <n-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1 ] = temp;
                }
            }
            if(ischecked == false) break;
        }
        
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
