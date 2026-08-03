package src.stacks;

import java.util.Stack;

public class maximal_rectangle {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        System.out.println(max_area(arr));
    }

    static int max_area(int mat[][]){
        int m = mat.length, n = mat[0].length;

        for(int i = 1; i<m; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j]==1) mat[i][j] += mat[i-1][j];
            }
        }
        int max = 0;
        for(int[] row : mat){
            int area = get_max_area(row);
            max = Math.max(area, max);
        }
        return max;
    }

    public static int get_max_area(int[] heights){
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
        st.push(0);  

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
