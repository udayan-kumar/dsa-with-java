package src.merge_sort_recursion;

import src.loop.infinite;

public class count_inversion {
    static int count;
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        count = 0;
       sort(arr);

    //    for(int ele : arr){
    //     System.out.print(ele + " ");
    //    }
    System.out.println(count);
    }

    public static void sort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int index = 0;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i = 0; i<a.length;i++){
            a[i] = arr[index++];
        }

        for(int i = 0; i<b.length; i++){
            b[i] = arr[index++];
        }

        sort(a);
        sort(b);

        merge(a, b, arr);
        
        
    }

    public static void merge (int[] a, int[] b, int[] c){
        int i = 0, j = 0 , k = 0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                c[k++] = a[i++];
            }
            else {
                c[k++] = b[j++];
            }
        }

        while(i<a.length) c[k++] = a[i++];

        while(j<b.length) c[k++] = b[j++];
        if(a[i] > b[j]) count += (a.length-i);
        
    }
}
