package src.loop;

public class even_number {
    public static void main(String[] args) {
        
        int n = 100;

        // for(int i = 1; i<=n ; i++){
        //     if(i%2 == 0) System.out.println(i);
        // }
// print all odd number divisible by 3 from 2 to 100

        for(int i = 1; i<=n;i++){
            if(i%2 != 0){
                if(i%3 == 0) System.out.println(i);
            }
        }
    }
}
