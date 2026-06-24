package src.sorting;

public class common_element {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,3,4,6,7,8};

        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;

        while(i < n-1 && j < m-1){   // time complexity = O(nlogn)
            if(a[i] == b[j]){
            System.out.println(a[i]);
            
            i++;
            j++;

        }
        else if (a[i] < b[j]) {
            i++;
        }
        else if(a[i] > b[j]){
            j++;
        }

        }

        
    }
}
