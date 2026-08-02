package src.stacks;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        //System.out.println(st.isEmpty());
        //System.out.println(st.size()==0);
        // st.pop();  // underflow
        st.push("udayan singh");  // adding
        st.push("mannu");
        st.push("kumar");
        st.push("tannu");
        System.out.println(st.size()); // size
        System.out.println(st);  // auxilary space = O(n)
        st.pop();  // remove last element
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());  // it returns the topmost element and then remove it
        String s = st.pop();  // store
    }
}
