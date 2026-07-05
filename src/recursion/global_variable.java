package src.recursion;

public class global_variable {

    static int n = 10;  // globl variable
    public static void main(String[] args) {
        change();
        n = 20;  // change the value
        System.out.println(n);

        int n = 50;  // local for this method function,, if i declare again then this varibale will run
        System.out.println(n);
        
    }

    public static void change(){
        n = 30;
        System.out.println(n);
    }
}
