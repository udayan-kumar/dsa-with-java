package src.cyclic_sort;

public class smallest_missing_element {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,4};
        small(arr);
    }

    public static void small(int[] arr){
        int i = 0;

        while(i<arr.length){
          int correctindex = arr[i];

          if(arr[i]>0 && arr[i] < arr.length && arr[i] != arr[correctindex]){
            swap(arr,i,correctindex);
          }
          else i++;
           
        }

        for(int j = 0; j<arr.length;j++){
            if(arr[j] > 0 && arr[j] != j){
                System.out.println(j);
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
