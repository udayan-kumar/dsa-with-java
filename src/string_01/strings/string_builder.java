import java.util.Scanner;

public class string_builder {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        StringBuilder udayan = new StringBuilder(ud.nextLine());  // we can take input
        StringBuilder sb = new StringBuilder("udayan");

        System.out.println(sb);
        System.out.println(sb.length() + " " + sb.capacity());
        sb.append("singh");
        System.out.println(sb);
        System.out.println(sb.length() + " " + sb.capacity());

       sb.setCharAt(2,'s');  // add any string in between
       System.out.println(sb);
       String manu = sb.toString();  // to convert into new string
       System.out.println(ud); 
   }
}
