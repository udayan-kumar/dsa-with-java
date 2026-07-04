package src.two_D_array;

import java.util.ArrayList;
import java.util.List;

public class spiral_traversing_matrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}};

         ArrayList <Integer> ans = new ArrayList<>();


        int m = arr.length, n = arr[0].length;
        int firstrow = 0,lastrow = m-1, lastcolm = n-1, firstcolm = 0;

       
        while(firstrow<=lastrow && firstcolm<=lastcolm){
            for(int j = firstcolm;j<=lastcolm;j++){
                // right
                ans.add(arr[firstrow][j]);
            }
            firstrow++;

            if(firstrow>lastrow || firstcolm>lastcolm)
                break;

             for(int i = firstrow;i<=lastrow;i++){
                // down
                ans.add(arr[i][lastcolm]);
            }
            lastcolm--;

             if(firstrow>lastrow || firstcolm>lastcolm)
                break;


             for(int j = lastcolm;j>=firstcolm;j--){
                // left
                ans.add(arr[lastcolm][j]);
            }
            lastrow--;

             if(firstrow>lastrow || firstcolm>lastcolm)
                break;


             for(int i = lastrow;i>=firstrow;i--){
                // up
                ans.add(arr[i][firstcolm]);
            }
            firstcolm++;

             if(firstrow>lastrow || firstcolm>lastcolm)
                break;

        }
        System.out.println(ans);
    }

   
}
