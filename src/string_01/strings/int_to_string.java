import java.util.Scanner;

public class int_to_string {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        int n = ud.nextInt();
        // String str = "";

        // str += n;

        // System.out.println(str);

        String str = Integer.toString(n);
        System.out.println(str);
    }
}
