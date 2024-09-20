package Characters;
import Fonctions.Fonction;

public class Character {

    private int health;
    private int strength;
    private String name;
    private int defense;


    public Character(int health, int strength, String name, int defense) {
        this.health     = health;
        this.strength   = strength;
        this.name       = name;
        this.defense    = defense;
    }
    
    public int attack() {
        return this.strength;
    }
    public int getHealth() {
        return this.health;
    }
    public void tostring() {
        if (health > 0){
            System.out.println(name + " a " + health + " de vie.");
        }
        else{
            System.out.println(name + " est décédé. RIP c'est dommage pour lui :(");
        }
    }    
    public void setHealth(int damage) {
        Fonction diceDamage = new Fonction();
        Fonction diceDefense = new Fonction();
        tostring();
        if ((diceDamage.getDice() + damage) > (diceDefense.getDice() + this.defense)) {
            this.health -= damage;
        }
        else {
            System.out.println("Bah alors "+ this.name +" ,tu as un trou dans la raquette ? MISS");
        }
    }
    public int getStrength() {
        return this.strength; 
    }
    public String getName() {
        return this.name;
    }
    public int getDefense() {
        return this.defense;
    }
}
