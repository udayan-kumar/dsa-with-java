package src.stacks;

import java.util.*;

public class num_visible_people_line {
    public static void main(String[] args) {
        int[] arr = {10,6,8,5,11,9};
        int ans[] = visible_people(arr);

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }

    public static int[] visible_people(int[] height){
        int n = height.length;
        Stack <Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(height[n-1]);
        ans[n-1] = 0;

        for(int i = n-2; i>=0; i--){
            int count = 0;
            while(st.size()>0 && st.peek()<=height[i]){
                count++;
                st.pop();
            }
            if(st.size()>0) count++;
            ans[i] = count;
            st.push(height[i]);
        }
        return ans;
        
    }
}
