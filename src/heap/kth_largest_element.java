package src.heap;

import java.util.PriorityQueue;

public class kth_largest_element {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
