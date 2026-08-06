package src.queues;

import java.util.*;

class myQueue{
    Stack <Integer> st = new Stack<>();
    Stack <Integer> helper = new Stack<>();

    public myQueue(){

    }

    void push(int val){
        //st.push(val);   O(1)


        // push at bottom at st   O(n)
        while(st.size()>0){
            helper.push(st.pop());
        }
        st.push(val);

        while(helper.size()>0){
            st.push(helper.pop());
        }
    }

    int pop(){
        // st ka bottom remove karo    O(n)
        // while(st.size()>1){
        //     helper.push(st.pop());
        // }
        // int front = st.pop();

        // while(helper.size()>0){
        //     st.push(helper.pop());
        // }
        // return front;


        return st.pop();    // O(1)
    }

    int peek(){
        // st ka bottom print karo
        // while(st.size()>1){
        //     helper.push(st.pop());
        // }
        // int front = st.peek();

        // while(helper.size()>0){
        //     st.push(helper.pop());
        // }
        // return front;


        return st.peek();
    }

    boolean empty(){
        return (st.size()==0);
    }
}

public class implementation_using_stacks {
    public static void main(String[] args) {
        
    }
}
