package src.recursion;

public class sub_string {
    public static void main(String[] args) {
        String str = "udayan";
        substr("",str,0);
    }

    public static void substr(String ans , String str , int indx){
        if(indx == str.length()){
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(indx);
        substr(ans+ch, str, indx+1);
        substr(ans, str, indx+1);  // skip
    }
}
