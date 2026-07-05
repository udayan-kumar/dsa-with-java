package src.recursion;

public class function_calling_itshelf {
    public static void main(String[] args) {
        udayan(1);
    }

    public static void udayan(int n){
        if(n == 10) return;
        System.out.println("udayan singh");
        udayan(n + 1);
    }
}
