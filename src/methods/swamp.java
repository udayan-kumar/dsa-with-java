package src.methods;

public class swamp {
    public static void Swamp(int a, int b){
        int Nnum = a;
        a = b;
        b = Nnum;
        System.out.println(a+" " +b);
    }
    public static void main(String[] args) {
        int a  = 10;
        int b = 5;
        System.out.println(a+" " +b);
        Swamp(a, b);
        System.out.println(a+" " +b);
    }
}
