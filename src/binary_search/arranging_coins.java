package src.binary_search;

public class arranging_coins {
    public static void main(String[] args) {
        int n = 10;
        int low = 1;
        int high = n;
        while(low<high){
            int mid = low +(high -low)/2;

            if(mid * mid > n){
                high = mid - 1;

            }
            else 
                if(mid * mid < n){
                    low = mid +1;
                }
        }
        int m = n;
        System.out.println((Math.sqrt(8*m +1) -1)/2);
    }
}
