package src.cyclic_sort;

public class set_mismatched {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5};
        mismatched(arr);
    }

    public static void mismatched(int[] arr){
        int i = 0;

        while(i<arr.length){
            int correctindex = arr[i]-1;

            if(arr[i] < arr.length && arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }
            else 
                i++;
        }

        for(int j = 0; j<arr.length;j++){
            if(arr[j] != j+1) {
                System.out.println("dublicate number: " +j);
                System.out.println("missing number: " + (j+1));
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
