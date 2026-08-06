package src.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class rearrange_queue {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        Queue <Integer> q1 = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        int n = q.size();

        // for(int i = 1; i<=n/2; i++){
        //     q1.add(q.remove());
        // }

        // while(q1.size()>0){
        //     q.add(q1.remove());
        //     q.add(q.remove());
        // }



        // second method
        Stack <Integer> st = new Stack<>();
        for(int i = 1; i<=n/2; i++){
            st.add(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i = 1; i<=n; i++){
            st.add(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }

        for(int i = 1; i<=n; i++){
            st.add(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        System.out.println(q);
    }
}
