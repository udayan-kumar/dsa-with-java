package src.stacks;

import java.util.*;
    class Pair{
        int val;
        int index;

        Pair(int val , int index){
            this.val = val;
            this.index = index;
        }
    }
public class stock_span {

    public static void main(String[] args) {
        int[] arr = {100,80,90,100,60,75,85};
        System.out.println(span(arr));
    }

    // static ArrayList<Integer> span(int[] arr){
    //     Stack <Integer> st = new Stack<>();
        
    //     int n = arr.length;
    //     int[] s = new int[n];

    //     s[0] = 1;
    //     st.push(0);

    //     for(int i = 1; i<n; i++){
    //         while(st.size()>0 && arr[st.peek()]<=arr[i])st.pop();

    //         if(st.size()==0) s[i] = i - (-1);
    //         else{
    //             s[i] = i - st.peek();
    //         }
    //         st.push(i);
    //     }
    //     ArrayList <Integer> ans = new ArrayList<>();
    //     for(int i =0; i<n ; i++){
    //         ans.add(s[i]);
    //     }
    //     return ans;
    // }


    public static ArrayList<Integer> span(int[] arr){
        Stack <Pair> st = new Stack<>();
        
        int n = arr.length;
        int[] s = new int[n];

        s[0] = 1;
        st.push(new Pair(arr[0],0));

        for(int i = 1; i<n; i++){
            while(st.size()>0 && st.peek().val<=arr[i])st.pop();

            if(st.size()==0) s[i] = i - (-1);
            else{
                s[i] = i - st.peek().index;
            }
            st.push(new Pair(arr[i], i));
        }
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i =0; i<n ; i++){
            ans.add(s[i]);
        }
        return ans;
    }
}
