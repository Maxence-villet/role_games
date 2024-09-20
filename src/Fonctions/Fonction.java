package Fonctions;
import java.util.Random;

public class Fonction {
    
    public int dice;
    Random rand;

    public Fonction () {
        rand = new Random();
        this.dice = rand.nextInt((20 - 0) + 1);
    }
    public int getDice() {
        return this.dice;
    }
}
