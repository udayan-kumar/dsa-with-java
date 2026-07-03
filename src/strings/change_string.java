public class change_string {
    public static void main(String[] args) {
        String str = "udayan";

        if(str.charAt(0) < 91){
            String upper = str.toUpperCase();
            System.out.println(upper);
        }
        else 
            if(str.charAt(0) > 96){
                String lower = str.toLowerCase();
                System.out.println(lower);
            }
    }
}
