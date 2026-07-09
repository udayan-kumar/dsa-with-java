package src.merge_sort_recursion;

public class merge_by_recursion {
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,9,3,5,7,10};
        sort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }

    public static void sort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        // step 1 --> convert array into two array
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int index = 0;
        // step 2 --> copy array into arr a and array b
       for(int i = 0; i<a.length;i++){
        a[i] = arr[index++];
       }
       for(int i= 0; i<b.length;i++){
        b[i] = arr[index++];
       }
       // step 3 --> magic
       sort(a);
       sort(b);
       // step 4 --> merge a and b into arr
       merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[]c){
        int i = 0, j = 0 , k = 0;

        while(i<a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }
    }
}
