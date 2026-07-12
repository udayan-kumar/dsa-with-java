package src.oops;

class fraction{
    int num;
    int den;

    fraction(int num , int den){
        this.num = num;
        this.den = den;
        simplify();
    }

    void print(){
        System.out.println(num + "/" + den);
    }

    void add(fraction f){
        num = num*f.den + den*f.num;
        den = den*f.num;
        simplify();
    }

    void multiply(fraction f){
        this.num = this.num*f.num;
        this.den = this.den*f.den;
        simplify();
    }

     void divide(fraction f){
        num = num*f.den;
        den = den*f.num;
        simplify();
    }

    void simplify(){
        boolean isnegative = (num*den<0)?true:false;
        num = Math.abs(num);
        int gcf = hcf(num,den);
        num = num/gcf;
       den = den/gcf;
       if(isnegative) num = -num;
    }

    int hcf(int a , int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
public class fraction_class {
    public static void main(String[] args) {
        fraction f1 = new fraction(3, -9);
        f1.print();

        fraction f2 = new fraction(2, 7);
        f1.add(f2);
        f1.print();

        f1.multiply(f2);
        f1.print();

        fraction f3 = new fraction(50, 100);
        f3.print();
    }
}
