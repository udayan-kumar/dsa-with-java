package src.stacks;

import java.util.Stack;

public class baseball_game {
    public static void main(String[] args) {
        
    }

    static int baseball(String[] arr){
        int n = arr.length;
        Stack <Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            String s = arr[i];
            if(s.equals("C")) st.pop();
            else 
                if(s.equals("D")) st.push(2*st.peek());
            else
                if(s.equals("+")){
                    int top = st.pop();
                    int secondtop = st.peek();
                    int add = top + secondtop;
                    st.push(top);
                    st.push(secondtop);
                    st.push(add);
                }
            else
                st.push(Integer.parseInt(s));
        }

        int sum = 0;
        while(st.size()!=0){
            sum += st.pop();
        }
        return sum;
       
    }
}
