package src.array;

public class merge_two_reverse {
    public static void main(String[] args) {
        int[] a = {2,5,6,9,20};
        int[] b = {1,3,4,5,7,8};

        int[] c = new int[a.length + b.length];

        merge(c,a,b);
        System.out.println();
        for(int ele : c){
            System.out.println(ele + " ");
        } 
        System.out.println();
    }

    public static void merge(int[] c, int[]a, int[]b){
        int i = a.length -1, j = b.length -1, k = c.length -1;

        while (i<a.length-1 && j<b.length-1){
            if(a[i] < b[j]){
                c[k--] = a[i--];
            }
            else 
                c[k--] = b[j--];
        }
        while (i<a.length -1){
            c[k--] = a[i--]; 
        }
        while (j<b.length -1){
            c[k--] = b[j--];
        }
    }
}
