package src.sorting;

public class sum_2_number {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3, 4, 5,  6, 7, 8 };
        int n =arr.length;

        int i = 0;
        int j = n-1;
        int target = 13;
        
        while(i<j){
            if(arr[i] + arr[j] == target){
                System.out.println(arr[i]);
                System.out.println(arr[j]);
                break;
            }
            else
                if(arr[i] + arr[j] > target){
                    j--;
                }
                else
                    if(arr[i] + arr[j] < target){
                        i++;
                    }
        }
            

    }
}
