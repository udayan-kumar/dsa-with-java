// arraylist --> it is a dynamic arrays(changing in nature) --> size of array can be increasing;

package src.array;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
         arr.add(3);
        arr.add(4);
         arr.add(5);
        arr.add(6);

        System.out.println(arr.get(3));  // arr[3]

        arr.set(4,25);  // arr[4] = 25
        System.out.println(arr.get(4));

        System.out.println(arr);

        int n = arr.size();  // arr.length
        for(int i = 0; i<n; i++){
            System.out.print(arr.get(i) + " ");
        }

        for(int ele : arr){
            System.out.print(ele);
        }

        arr.add(2,100); // i can add any new number in any index of array

        System.out.println(arr);

        arr.remove(3);
        System.out.println(arr);

        Collections.reverse(arr);  // reverse the array
        System.out.println(arr);

        // int i = 0, j =arr.size();

        // while(i<j){
        //     int temp = arr.get(i);
        //     arr.set(i,arr.get(i) );
        //     arr.set(i, temp);
        //     i++;
        //     j--;
        // }
        // System.out.println(arr);
    }
}
