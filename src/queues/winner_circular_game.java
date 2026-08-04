package src.queues;

import java.util.LinkedList;
import java.util.Queue;

public class winner_circular_game {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.add(11);

        int k = 9;

        while(q.size()>1){
            for(int i = 1; i<=k-1; i++){
                q.add(q.remove());
            }
            q.remove();
        }

        System.out.println(q.peek());
    }
}
