package src.sorting;

public class move_zero_end {
    public static void main(String[] args) {
        int[] arr = {1,0,7,4,0,3,8,0,9};
        int n = arr.length;

        // for(int i =0; i<n-1; i++){
        //     boolean ischecked = true;
        //     for(int j = 0; j<n-1; j++){
        //         if(arr[j] == 0){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        //     if(ischecked == false) break;
        // }

        int j = 0;
        
        for(int i=0; i<n; i++){    // BETTER WAY
            if(arr[i] != 0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
        }
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    
    }
}
