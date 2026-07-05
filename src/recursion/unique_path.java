package src.recursion;

public class unique_path {
    public static void main(String[] args) {
        int m = 5;
        int n = 8;
        // System.out.println(crush(m, n));
        System.out.println(crush(m, n));
    }

    public static int crush(int m , int n){
        // if(m ==1 || n == 1) return 1;
        // return crush(m-1, n) + crush(m, n-1);
        return unique(0, 0, m-1, n-1);
    }

    public static int unique(int cr, int cc, int lr, int lc){
        if(lr == cr && cc == lc) return 1;
        if(cr>lr || cc > lc) return 0;
        int right = unique(cr+1, cc, lr, lc);
        int down = unique(cr, cc+1, lr, lc);
        return right + down;
    }
}
