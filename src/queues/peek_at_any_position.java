package src.queues;

import java.util.LinkedList;
import java.util.Queue;

public class peek_at_any_position {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        peek(q, 4);

    }

    static void peek(Queue <Integer> q,int index){
        int n = q.size();
        for(int i = 0; i<index; i++){
            q.add(q.remove());
        }
        System.out.println(q.peek());

        for(int i = 0; i<n-index; i++){
            q.add(q.remove());
        }
    }
}
