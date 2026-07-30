package src.stacks;

import java.util.Stack;

public class traversing_top_bottom {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        while(st.size()>0){
            System.out.println(st.pop());
        }
    }
}
