package src.recursion;

import java.util.ArrayList;

public class generate_braces {
    public static void main(String[] args) {
        int n = 5;
        braces(n);
    }

    public static ArrayList braces(int n){
        ArrayList <String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        System.out.println(ans);
        return ans;
    }
    public static void generate(int n, int l , int r, String str , ArrayList <String> ans ){
        if(r == n){
            ans.add(str);
            return;
        }
        if(l<n) generate(n, l+1, r, str+"(", ans);
        if(r<l) generate(n, l, r+1, str+")", ans);
    }
}
