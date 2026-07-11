public class equal_string {
    public static void main(String[] args) {
        // String s1 = "udayan";
        // String s2 = "udayan";

        // System.out.println(s1 == s2);  // true

        String s1 = "udayan";
        String s2 =new String("udayan");

        // System.out.println(s1 == s2); // false

        System.out.println(s1.equals(s2));  // true


    }
}
