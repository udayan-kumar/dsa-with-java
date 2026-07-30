package src.stacks;

import java.util.*;



public class reverse_recursively {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(10); // bottom
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60); // top

        reverse(st);
        System.out.println(st);
    }

    public static void reverse(Stack <Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        reverse(st);
        push_bottom(st,top);
    }

    public static void push_bottom(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        push_bottom(st, ele);
        st.push(top);
    }
}
