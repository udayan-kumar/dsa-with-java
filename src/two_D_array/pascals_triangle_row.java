package src.two_D_array;

import java.util.ArrayList;
import java.util.List;

public class pascals_triangle_row {
    public static void main(String[] args) {
        int rowindex = 3;
        int n = 5;

        List <List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            List <Integer> list = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                list.add(1);
            }
            ans.add(list);
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i;j++){
                if(j==0 || j==i){
                    ans.get(i).set(i, 1);
                }
                else {
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).set(j,val);
                }
            }
        }
        System.out.println(ans.get(rowindex));
    }
}
