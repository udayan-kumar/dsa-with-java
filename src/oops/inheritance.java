package src.oops;

class pokemon{
     int power;
    String type;
    pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }

    pokemon(int power, String type){
        this.power = power;
        this.type = type;
    }

    pokemon(){

    }

    int getpower(){
        return power;
    }

    void print(){
        System.out.println(this.power + " "+ this.type);
    }
}

class legendarypokemon extends pokemon{  // child class (all property of pokemon are present and their own different property arw also present)
    String ability;
}

class strongpokemon extends pokemon{
    int speed;
}

class godpokemon extends legendarypokemon{
    char tag;
}

public class inheritance {
    public static void main(String[] args) {
        legendarypokemon mewtwo = new legendarypokemon();
        mewtwo.ability = "pressure";

        // pokemon pikachu = new pokemon();
        // pikachu.ability = "pressure"; // error

        godpokemon dialga = new godpokemon();
        dialga.ability = "speed";
    }
}
