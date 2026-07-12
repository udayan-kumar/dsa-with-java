package src.oops;

class complex_num{
    double x;
    double y;

    complex_num(){

    }

    complex_num(double x, double y){
        this.x = x;
        this.y = y;
    }

    void print(){
        if(y>=0)System.out.println(x + " + i" + y);
        else System.out.println(x +" -" +" i" +(-y));
    }

    void add(complex_num z){
       x += z.x;
       y += z.y;
    }

    void multiply(complex_num z){
        x = x*z.x - y*z.y;
        y = y*z.x + y*z.x;
    }
}
public class complex_number {
    public static void main(String[] args) {
        complex_num z1 = new complex_num(2, 6);
        z1.print();

        complex_num z2 = new complex_num(3, -4);
        z2.print();

        // z1.add(z2);
        // z1.print();
        // z2.print();

        z1.multiply(z2);
         z1.print();
        z2.print();
    }
}
