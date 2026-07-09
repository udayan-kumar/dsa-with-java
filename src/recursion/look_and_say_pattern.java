package src.recursion;

public class look_and_say_pattern {
    public static void main(String[] args) {
       System.out.println(count(5));
    }

    public static String count(int n){
        if(n==1) return "1";
        String str = count(n-1) +"#";
        String ans = "";
        int i =0, j= 0;
      while(j<str.length()){
        if(str.charAt(i) == str.charAt(j)) i++;
        else {
            int freq = j-1;
            ans += freq;
            ans += str.charAt(i);
            i=j; 
        }
      }
      return ans;
    }
}
