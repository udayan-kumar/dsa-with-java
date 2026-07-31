package src.stacks;

import java.util.*;

public class greater_element_two {
    public static void main(String[] args) {
        int[] arr = {1,8,9,5,7,1,6,4};

        System.out.println(greater_num(arr));
    }

    static ArrayList<Integer> greater_num(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack <Integer> st = new Stack<>();
        for(int i = n-1; i>0; i--){
            st.push(arr[i]);

        }
        for(int i = n-1; i>0; i--){
            while(st.size()>0 && arr[i]>=st.peek()) st.pop();
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
