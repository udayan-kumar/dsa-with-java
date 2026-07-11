package src.oops;

public class methods_in_class {
    public static class  car {
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats + " " + name + " " + length + " " + type + " " + torque);
        }
    }

    public static void main(String[] args) {
        car c = new car();
        c.length = 3.44;
        c.name = "lia sonet";
        c.seats = 4;
        c.torque = 194;
        c.type = "SUV";

         car c1 = new car();
        c1.length = 3.90;
        c1.name = "scorpio";
        c1.seats = 6;
        c1.torque = 199;
        c1.type = "SUV";

         car c2 = new car();
        c2.length = 3.23;
        c2.name = "thar";
        c2.seats = 2;
        c2.torque = 190;
        c2.type = "THAR";

        c.print();
        c1.print();
        c2.print();
    }
}
