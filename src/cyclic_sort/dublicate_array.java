package src.cyclic_sort;

public class dublicate_array {
    public static void main(String[] args) {
        int[] arr = {3,5,9,3,2,1,4,4,8,10,6,7};
        dublicate(arr);
    }

    public static void dublicate(int[] arr){
        int i = 0 ;
        while(i<arr.length){
            int correctindex= arr[i];
            if(i<arr.length && arr[i] != arr[correctindex]){
                swap(arr, i , correctindex);
            }
            else i++;
        }

        for(int j = 0; j<arr.length; j++){
            if(arr[j] != j){
                System.out.println(arr[j]);
            }
        }
    }

    public static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
