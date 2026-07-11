package src.oops;

public class constructor {
    public static class  car {
        int seats;
        String name;
        double length;
        String type;
        int torque;

        car(){  // default constructor

        }

        car(int x, String s, double d){
            seats = x;
            name = s;
            length = d;
        }

        car(String s, int x, double d){
            name = s;
             seats = x;
            length = d;
        }

        void print(){
            System.out.println(seats + " " + name + " " + length);
        }
    }
    public static void main(String[] args) {
        car c1 = new car(5, "kia sonet", 135);
        c1.print();

        car c2 = new car(4, "lord alto", 138);
        c2.print();

        car c3 = new car("lord alto", 7, 132);
        c3.print();

    }
}
