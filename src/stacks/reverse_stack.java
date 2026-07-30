package src.stacks;

import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        reverse(st);
    }

    public static void reverse(Stack <Integer> st){
        Stack <Integer> st1 = new Stack<>();
        Stack <Integer> st2 = new Stack<>();

        while(st.size()>0){
            st1.push(st.pop());
        }

        while(st1.size()>0){
            st2.push(st1.pop());
            //System.out.print(st2.pop() + " ");
        }
        
        while(st2.size()>0){
            st.push(st2.pop());
            System.out.print(st.pop() + " ");
        }
    }
}
