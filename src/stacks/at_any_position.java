package src.stacks;

import java.util.Stack;

public class at_any_position {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        //get(st,2);

        add(st,2,99);

        //remove(st, 2);



    }

    public static void get(Stack<Integer> st , int index){
       

        Stack <Integer> st2 = new Stack<>();

        while(st.size() > index + 1){
            st2.push(st.pop());
        }
        // System.out.println(st.peek());
    }

    public static void add(Stack<Integer> st, int index, int value){
        Stack <Integer> st2 = new Stack<>();

        while(st.size()>index){
            st2.push(st.pop());
        }
        st.push(value);

        while(st2.size()>0){
            st.push(st2.pop());
            System.out.println(st.pop());

        }
    }

    public static void remove(Stack <Integer> st, int index){
        Stack <Integer> st2 = new Stack<>();

        while(st.size()>index+1){
            st2.push(st.pop());
        }
        st.pop();

        while(st2.size()>0){
            st.push(st2.pop());
            System.out.println(st.pop());

        }

    }
}
