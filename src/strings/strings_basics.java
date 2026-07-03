package src.strings;

import java.util.Scanner;

public class strings_basics {
   public static void main(String[] args) {
    Scanner ud = new Scanner(System.in);

    //  String str = "udayan is a handsome boy";   // declearation of strings
    //  System.out.println(str);

    String str = ud.next();  // after space no line or word will be printed
    System.out.println(str);
    String t = ud.nextLine();  // all the line will be printed
    System.out.println(t);
   }


}
