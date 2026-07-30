package src.stacks;

import java.util.Stack;

public class push_bottom_recursively {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(10); // bottom
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60); // top

        bottom(st, 100);
        System.out.println(st);

    }

    public static void bottom(Stack <Integer> st , int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        bottom(st, ele);
        st.push(top);
    }
}
