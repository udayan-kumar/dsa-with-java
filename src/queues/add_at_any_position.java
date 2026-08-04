package src.queues;

import java.util.LinkedList;
import java.util.Queue;

public class add_at_any_position {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        add(q, 3,100);
        
        System.out.println(q);
    }

    static void add(Queue <Integer> q, int index, int val){
        int n = q.size();
        for(int i = 0; i<index; i++){
            q.add(q.remove());

        }
        q.add(val);
        for(int i = 0; i<n-index; i++){
            q.add(q.remove());
        }
    }
}
