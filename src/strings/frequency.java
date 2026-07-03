import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        String str ="character";
        // int n = str.length();
        // int maxfre = -1;
        // char ans = str.charAt(0);

        // method1
        // for(int i =0; i<n; i++){
        //     int fre = -1;
        //     char ch = str.charAt(i);
        //     for(int j = i+1; j<n; j++){
        //         if(str.charAt(j) == ch){
        //             fre++;
        //         }
        //         if(fre>maxfre){
        //             maxfre = fre;
        //             ans = ch;
        //         }
        //         else 
        //             if(fre == maxfre && ch<ans){
        //                 ans =ch;
        //             }
        //     }

        // }

        // method 2

        // char[] arr = str.toCharArray();
        // Arrays.sort(arr);
        // int i =0; 
        // int j =0;
        // while(j<n){
        //     if(arr[i] == arr[j]){
        //         j++;
        //     }
        //     else{
        //         int fre = j-i;
        //         if(fre > maxfre){
        //             maxfre = fre;
        //             ans = arr[i];
        //         }
        //         i =j;
        //     }
        // }
        //         int fre = j-i;
        //         if(fre > maxfre){
        //             maxfre = fre;
        //             ans = arr[i];
        //         }

        // method 3

        int n = str.length();
        int[] arr = new int[26];
        for(int i =0 ; i<n; i++){
            char ch  = str.charAt(i);
            int idx = ch - 'a';
            arr[idx]++;
        }
        int maxfrq =0;
        char ans = str.charAt(0);
        for(int i = 0;i<26;i++){
            if(arr[i]> maxfrq){
                maxfrq = arr[i];
                ans = (char)(i + 97);
            }
        }
        System.out.println(ans);
    }
}
