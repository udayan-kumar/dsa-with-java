// bubble sort --> it is a algorithim for which i can sort array,,


package src.sorting;

public class bubble_sort {

    // public static void print(int[] arr){
    //     for (int ele : arr){
    //         System.out.print(ele + " ");
    //     }
    //     System.out.println();
    // }
    public static void main(String[] args) {
        int[] arr= {3,4,1,2,5,3,6,7,5,8};
        int n = arr.length;

        // print(arr);
        for(int i = 0; i<n-1;i++){

            boolean issorted = true; // check array will be sorted or not;;  if sorted than next code will not run

            for(int j =0; j<n-i-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    
                    
                }
            }
             if(issorted == false) break;  // if array will not sorted than it check and ;; and code will run
       
        }
            // print(arr);
            for(int ele : arr){
                System.out.print(ele + " ");
            }
                    

    }
}