package src.sorting;

public class union {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int[] b = {1,2,6,7,8};

        int n = a.length;
        int m = b.length;

        int i = 0; 
        int j = 0;
        while(i<n && j<m){
            if(a[i] == b[j]){
                System.out.print(a[i]);
                i++;
                j++;
            }
            else if(a[i] > b[j]){
                System.out.print(b[j]);
                j++;
            }
            else if(a[i] < b[j]){
                System.out.print(a[i]);

                i++;
            }
            
        }

    }
}
