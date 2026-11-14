package src.heap;

import java.util.PriorityQueue;

public class minimum_cost_connected_ropes {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 6, 9};
        int cost = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : arr){
            pq.add(ele);
        }

        while(pq.size()>1){
            int top = pq.remove();
            int second_top = pq.remove();
            int sum = top + second_top;

            cost += sum;

            pq.add(sum);
        }
        System.out.println(cost);
    }
}
