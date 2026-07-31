package src.stacks;

import java.util.*;


public class next_greater_element {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4};
        
        System.out.println(greater_number(arr));
    }

    static ArrayList<Integer> greater_number(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1;
        Stack <Integer> st = new Stack<>();
        st.push(arr[n-1]);

        for(int i = n-2; i>=0 ; i--){
            while(st.size()>0 && st.peek()<=arr[i]) st.pop();
            if(st.size()==0) nge[i] = -1;
            else
                nge[i] = st.peek();
            st.push(arr[i]);
        }
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            ans.add(nge[i]);
        }
        return ans;
    }
}
