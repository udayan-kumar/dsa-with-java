package src.heap;

import java.util.PriorityQueue;

public class k_sorted_array {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        int index = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : arr){
            pq.add(ele);

            if(pq.size()>k) arr[index++] = pq.remove();
        }

        while(pq.size()>0) arr[index++] = pq.remove();

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
