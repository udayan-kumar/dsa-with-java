package src.two_D_array;

import java.util.ArrayList;
import java.util.List;

public class multiply_matrix {
    public static void main(String[] args) {
        int [][] a = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}};
        
        int [][] b = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}};

        int n = a.length;
        ArrayList <Integer> ans = new ArrayList<>();
        int[][] c= new int[n][n];

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                for(int k = 0; k<n;k++){
                    c[i][j] += a[i][k] * b[k][j];
                     
                   
                }
                 ans.add(c[i][j]);
            }
           
        }
        System.out.println(ans);
    }
}
