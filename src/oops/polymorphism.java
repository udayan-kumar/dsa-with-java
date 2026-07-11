package src.oops;

public class polymorphism {
    public static class dog {
        void speak(){
            System.out.println("bhaw bhaw");
        }
        
    }

     public static class cat {
        void speak(){
            System.out.println("mew mew");
        }
        
    }

     public static class lion {
        void speak(){
            System.out.println("garrrr");
        }
        
    }

     public static class pikachu {
        void speak(){
            System.out.println("pika pika");
        }
        
    }
    public static void main(String[] args) {
        dog tommy = new dog();
        cat sily = new cat();
        lion sher = new lion();
        pikachu udayan = new pikachu();

        tommy.speak();
        sily.speak();
        sher.speak();
        udayan.speak();
    }
}
