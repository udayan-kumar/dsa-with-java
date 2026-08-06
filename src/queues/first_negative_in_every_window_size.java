package src.queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class first_negative_in_every_window_size {
    public static void main(String[] args) {
        int[] arr = {-8,2,3,-6,10};
        
        System.out.println(first_negative(arr, 3));
    }

    static List<Integer> first_negative(int[] arr, int k){
        List <Integer> ans = new ArrayList<>();
        int n = arr.length;
        Queue <Integer> q = new LinkedList<>();

        for(int i = 0; i<n; i++){
            if(arr[i]<0){
                q.add(i);
            }
        }

        for(int i = 0; i<n-k+1; i++){
            // window is from i to n+k-1
            while(q.size()>0 && q.peek()<i){
                q.remove();
            }
            if(q.size()>0 && q.peek()<=i+k-1){
                ans.add(arr[q.peek()]);
            }
            else
                ans.add(0);  // code will be right it takes element 0 , we want only print 0
        }
        return ans;
    }
}
