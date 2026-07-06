package src.recursion;

public class pre_in_post {
    public static void main(String[] args) {
        int n = 4;
        rip(n);
    }
    public static void rip(int n){
        if(n == 0) return;
        System.out.print("pre " + n + " ");
        rip(n-1);
        System.out.print("in " + n + " ");
        rip(n-1);
        System.out.print("post " + n + " ");
    }
}
