// print reverse the array;

package src.array;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,6,9,8,11,23};
        int n = arr.length;
        int i = 0;
        int j = n-1;

        // for(int i =0; i<n/2; i++){  // second method
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
        for(int ele : arr){
            System.out.println(ele);
        }
       
    }
}
