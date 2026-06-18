package src.methods;

public class argument {
    public static void max(int a, int b , int c) { // parameter
        if(a>=b && b>=c) System.out.println(a);
        else System.out.println(c);
    }
    public static void main(String[] args) {
        max(5,6, 8); //argument, 
    }
}
