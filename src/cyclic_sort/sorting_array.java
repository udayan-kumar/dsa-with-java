package src.cyclic_sort;

public class sorting_array {
    public static void main(String[] args) {
        int[] arr = {3,5,9,2,1,4,8,10,6,7};
       
        int i = 0;
        while(i<arr.length){
            int correctindex = arr[i] - 1;
            if(arr[i] == arr[correctindex]) i++;
            else {
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
