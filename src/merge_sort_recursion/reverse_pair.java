package src.merge_sort_recursion;

import src.pattern_printing.star_plus;

public class reverse_pair {
    static int count;
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1};
        count =0;
       sort(arr);
       System.out.println(count);
    }

    public static void sort(int[] arr){
        int n = arr.length;
        if(n == 1) return;
        
        int[] a = new int[n/2];
        int[] b = new int [n-n/2];
        int index = 0;

        for(int i = 0; i<a.length; i++){
            a[i] = arr[index++];
        }

        for(int i = 0; i<b.length; i++){
            b[i] = arr[index++];
        }

        sort(a);
        sort(b);
        
        inversion(a, b);

        merge(a, b, arr);
    }

    public static void merge (int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }
            else {
               
                c[k++] = b[j++];
            }
        }

        while(i<a.length) c[k++] = a[i++];

        while(j<b.length) c[k++] = b[j++];
    }

    public static void inversion(int[] a, int[] b){
        int i = 0, j=0;
        while(i<a.length && j<b.length){
            if((long)a[i]>(2*(long)b[j])){
                count += a.length-i;
                j++;
            }
            else i++;
        }
    }
}
