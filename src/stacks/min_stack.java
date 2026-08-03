package src.stacks;

import java.util.Stack;

import src.if_else.integer;

class minStack{
    //Stack <Integer> st;
    Stack <Long> st;
    //Stack <Integer> minst;
    Long min;

    minStack(){
        st = new Stack<>();
        //minst = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int val){
        // st.push(val);
        // if(minst.size()==0 || val<st.peek()) minst.push(val);
        // else minst.push(minst.peek());


        if(st.size()==0) min = (long)(val);

        if((long)val >= min) st.push((long)val);
        else{ // stack meinfake value daale
            st.push((long)val + ((long)val-min));
            min = (long)val;
        }
    }

    public void pop(){
        // st.pop();
        // minst.pop();



        if(st.peek()<min){ // minimum roll back karo
            min = min + (min - st.peek());
        }
        st.pop();
    }

    public int top(){ // peek
       //return st.peek();


       long a = st.peek();
       if(a<min){
        //return (int)min;  
       }
       else return (int)a;
    }

    public int getmin(){
        //return minst.peek();


        return (int)min;
    }
}
public class min_stack {
    public static void main(String[] args) {
        // leetcode problem
    }
}
