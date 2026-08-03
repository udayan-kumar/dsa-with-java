package src.stacks;

import java.util.Stack;

class minStack{
    Stack <Integer> st;
    Stack <Integer> minst;

    minStack(){
        st = new Stack<>();
        minst = new Stack<>();
    }

    public void push(int val){
        st.push(val);
        if(minst.size()==0 || val<st.peek()) minst.push(val);
        else minst.push(minst.peek());
    }

    public void pop(){
        st.pop();
        minst.pop();
    }

    public int top(){ // peek
       return st.peek();
    }

    public int getmin(){
        return minst.peek();
    }
}
public class min_stack {
    public static void main(String[] args) {
        // leetcode problem
    }
}
