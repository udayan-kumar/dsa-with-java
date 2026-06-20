// multiply odd indexed element by b2 and add 10 to even indexed element

package src.array;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        int n = ud.nextInt();
        int [] arr = new int[n];
        int[] arr ={11,22,33,44,55};
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i] * 2);
            }
            else 
                if(arr[i] %2 == 1){
                    System.out.println(arr[i] + 2);
                }
        }
    }
}
