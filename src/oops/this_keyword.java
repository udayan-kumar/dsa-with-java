package src.oops;

public class this_keyword {
    public static class  car {
        int seats;
        String name;
        double length;
        String type;
        int torque;

        car(){  // default constructor

        }

        car(int seats, String name, double length){
            this.seats = seats;
            this.name = name;
            this.length = length;
        }

        car(String s, int x, double d){
            name = s;
             seats = x;
            length = d;
        }

        void print(){
            int seats= 30;
            System.out.println(this.seats + " " + name + " " + length);
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
