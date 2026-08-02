package src.stacks;

import java.util.*;



public class celebrity_problem {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{0,1,0},{0,1,1}};
        System.out.println(celebrity(arr));
    }

    public static int celebrity(int[][] arr){
        int n = arr.length;
        Stack <Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            st.push(i);
        }

        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            boolean aflag = true;
            boolean bflag = true;

            if(arr[a][b]==1){ // a b ko jaanta hai,, to a celebrity nhii hua
                aflag = false;
            }
            else 
                if(arr[a][b]==0){ // a b ko nhii janta hai ,, b celebrity nhii hua
                    bflag = false;
                }

            if(arr[b][a]==1){ // b a ko jaanta hai,, b celebrity nhii hua
                bflag = false;
            }
            else 
                if(arr[b][a]==0){ // b a ko nhii jaanta hai,, a celebrity nhii hua
                    aflag = false;
                }

            if(aflag) st.push(a);
            if(bflag) st.push(b);
        }

        if(st.size()==0) return -1;
        int celeb = st.pop();

        for(int j = 0; j<n; j++){
            if(j==celeb) continue;
            if(arr[celeb][j]==1) return -1;
        }

        for(int i = 0; i<n; i++){
            if(i==celeb) continue;
            if(arr[i][celeb]==0) return -1;
        }
        return celeb;

    }
}
