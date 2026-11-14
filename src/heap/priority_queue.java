package src.heap;

import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        // MINHEAP
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);

        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.size());

        for(int ele : pq){
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.println(pq);
    }
}
