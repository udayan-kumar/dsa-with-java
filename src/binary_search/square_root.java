package src.binary_search;

public class square_root {
    public static void main(String[] args) {
        int n = 20;

        int root =0;
        // for(int i = 0; i<n ;i++){
        //     if(i*i >= n)
        //         break;
        //     root = i;
        // }
        // System.out.println(root);
        int low = 1;
        int high = n;
        while (low < high ){
            int mid  = (low + high)/2;
            if(mid * mid >n){
                high = mid -1;
            }
            else 
                if(mid * mid < n){
                    low = mid +1;
                }
                
        }
        System.out.println(high);
    }
}
2:10