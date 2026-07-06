package src.recursion;

import java.util.ArrayList;

public class string {
    public static void main(String[] args) {
        ArrayList <String> as = new ArrayList<>();
        as.add("udayan");
        as.add("tannu");
        as.add("mannu");

        change1(as);
        System.out.println(as);
    }
    public static void change1(ArrayList <String> as ){
        as.add("kumar");
    }
}
