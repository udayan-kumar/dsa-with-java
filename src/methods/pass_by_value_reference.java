package src.methods;

public class pass_by_value_reference {
    public static void change(int a){
        int x  = 10; // nicche wale sout ke karan print hoga na ki main function ke sout ke karan

        System.out.println(x);
    }
    public static void main(String[] args) {
        int x  =5;
        System.out.println(x);
        change (x);
        System.out.println(x);
    }
}
