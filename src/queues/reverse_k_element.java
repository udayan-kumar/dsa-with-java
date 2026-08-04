package src.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_k_element {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        int n = q.size();

        Stack <Integer> st = new Stack<>();

        int k = 3;
        while(q.size()!=k){
            st.add(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        for(int i = 0; i<n-k; i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
