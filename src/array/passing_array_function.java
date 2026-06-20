package src.array;

public class passing_array_function {
    public static void main(String[] args) {
        int[] x ={1,2,3,4,5};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);   // value = 101 because i take array variable not normal variable
    }
    public static void change(int[] y){  // in java when we take normal varable than both are different i can't access the value of x with y but when i take array variable then i access array value by both x as well as y and we can change the main array value by both x and y
        y[2] = 101;
    }
}
