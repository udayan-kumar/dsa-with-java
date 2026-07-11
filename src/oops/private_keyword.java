package src.oops;

class students {
        String name; // default value --> null
        private int roll = 20;  // default value --> 0;; private --> we can't access this
        double cgpa;  // default value --> 0.0
        // private void print(){
        //     System.out.println(name + " " + roll + " " + cgpa);
        // }

        public void print(){  // getter
            System.out.println(name + " " + roll + " " + cgpa);
        }

        int getrno(){  // geter for private
            return roll;
        }

        void setrno(int x){  // setter for private
            roll = x;
        }

        // public void p(){
        //     print();
        // }
}
public class private_keyword {
    
    public static void main(String[] args) {
        students s1 = new students();
        s1.cgpa = 9.4;
        s1.name = "udayan";
        // s1.p();
        // System.out.println(s1.roll);

        // s1.roll = 45; // error
        s1.setrno(45);  // i can set in private
        System.out.println(s1.getrno());
    }
}
