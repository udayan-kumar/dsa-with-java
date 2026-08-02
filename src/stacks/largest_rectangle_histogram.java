package src.stacks;

import java.util.*;

public class largest_rectangle_histogram {
    public static void main(String[] args) {
        int[] arr = {5,3,6,2,5,4};
        System.out.println(largest_rec(arr));
    }

    public static int largest_rec(int[] heights){
        int n = heights.length;
        int nse[] = new int[n];
        nse[n-1] = n;
        Stack <Integer> st = new Stack<>();
        st.push(n-1);

        for(int i = n-2; i>=0; i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0) nse[i] = n;
            else
                nse[i] = st.peek();
                st.push(i);
        }

        while(st.size()>0) st.pop();

        int pse[] = new int[n];
        pse[0] = -1;
        st.push(0);  // yanha par item 0 nhii hoga ,, index 0 hoga,, lekin ye item 0 le raha hai esiliye index out of bound aaraha hai

        for(int i = 1; i<n; i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0) pse[i] = -1;
            else
                pse[i] = st.peek();
                st.push(i);
        }

        int maxarea = 0;
        for(int i = 0; i<n; i++){
            int area = heights[i] * (nse[i]-pse[i]-1);
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }
}
