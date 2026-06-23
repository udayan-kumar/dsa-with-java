package src.array;

public class merge_three_array {
    public static void main(String[] args) {
        int[] a = {1,3,7,8};
        int[] b = {2,5,6,10};
        int[] c = {4,9,11};

        int[] d = new int[a.length + b.length + c.length];
        merge(d,a,b,c);
        for(int ele : c){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void merge(int[] d,int[] a,int[] b, int[] c){
        int i=0,j=0,k=0,l=0;

        while (i<a.length && j<b.length && k<c.length){
            if(a[i] <b[j]){
                d[l++] = a[i++];
            }
            else 
                if(a[i]>b[j]){
                    d[l++] = b[j++];
                }
                else 
                    d[l++] = c[k++];
        }
        while (i< a.length) {
            d[l++] = a[i++];
        }
        while (j<b.length) {
            d[l++] = b[j++];
        }
        while (k<c.length) {
            d[l++] = c[k++];
        }
    }
}
