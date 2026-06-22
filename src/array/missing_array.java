package src.array;

public class missing_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int n = arr.length + 1 ;
        int sum = n*(n+1)/2;
        int arrsum  = 0;

        for(int ele : arr){
            arrsum += ele;
        }

        System.out.println(sum - arrsum);
    }
}
