package src.oops;

public class passing_class_to_method {
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

        change(c);

        System.out.println(c.seats);
    }

    public static void change(car c){
        c.seats = 10;  // object pass by references...
    }
}
