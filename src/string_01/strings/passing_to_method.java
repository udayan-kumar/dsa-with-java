package src.strings;

public class passing_to_method {
    public static void change(String str){
        str = "raghgav";
    }
    public static void main(String[] args) {
        String str = "udayan";
        System.out.println(str);
        change(str);
        System.out.println(str);
    }
}
