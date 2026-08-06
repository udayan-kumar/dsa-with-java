package src.queues;

import java.util.*;

class myStack{
    Queue <Integer> q = new LinkedList<>();

    void push(int val){
        //q.add(val);


        // q ke front pa add karna 
        q.add(val);   //O(n)
        int n = q.size();
        for(int i = 1; i<=n; i++){
            q.add(q.remove());
        }
    }

    int pop(){
        // int n = q.size();
        // for(int i = 1; i<=n; i++){
        //     q.add(q.remove());
        // }

        // return q.remove();


        return q.remove();
    }

    int peek(){
        // int n = q.size();
        // for(int i = 1; i<=n; i++){
        //     q.add(q.remove());
        // }
        // int p = q.peek();
        // q.add(q.remove());

        // return p;


        return q.peek();
    }

    boolean empty(){
        return (q.size()==0);
    }
}
public class implementation_stacks_using_queue {
    public static void main(String[] args) {
        myStack st = new myStack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
    }
}
