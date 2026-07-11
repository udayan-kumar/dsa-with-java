package src.oops;

class cricketer{
    // final String country = "India";
     static String country = "England" ;
    int runs;
    String name;
    double avg;
}
public class final_and_static {
    public static void main(String[] args) {
        cricketer c1 = new cricketer();
        c1.country = "India";
        System.out.println(c1.country);

         cricketer c2 = new cricketer();
         System.out.println(c2.country);
    }
}
