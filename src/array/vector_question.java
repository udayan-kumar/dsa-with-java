  // add one
  
package src.array;

import java.util.ArrayList;
import java.util.Collections;

public class vector_question {
    public static void main(String[] args) {

        int[] arr = {1,2,3,9};
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int carry = 1;

        for(int i = n; i>0;i--){
            if(arr[i] + carry <= 9){
                ans.add(arr[i] + carry);
                carry = 0;
            }
            else {
                ans.add(arr[i] + carry);
                carry =1;
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
