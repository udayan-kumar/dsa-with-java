public class sum_substring {
    public static void main(String[] args) {
        String str = "1234";
        String sum = "0";
        for(int i = 0; i<str.length(); i++){
            for(int j =i+1; j<=str.length();j++){
               sum = sum + str.substring(i , j);
            }
        }
        System.out.println((sum));
    }
}
