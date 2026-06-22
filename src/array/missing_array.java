package src.array;

public class missing_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int n = arr.length + 1 ; // index number and arr.length ,, both are different ,, in this index number is 5 but arr.length is 6
        int sum = n*(n+1)/2;
        int arrsum  = 0;
        System.out.println(arr.length);

        for(int ele : arr){
            arrsum = arrsum + ele;
        }

        System.out.println(sum - arrsum);
    }
}
