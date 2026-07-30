package src.stacks;

import java.util.Stack;

public class traversing_top_bottom {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        Stack <Integer> st1 = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        while(st.size()>0){
            int top = st.pop();
            System.out.println(top);
            st1.push(top);
        }

        while(st1.size()>0){
            st.push(st1.pop());
        }
    }
}
