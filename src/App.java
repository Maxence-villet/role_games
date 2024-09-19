import java.util.Scanner;

import Characters.Character;

public class App {

    
    
    public static void main(String[] args) throws Exception {
        
        // initialisation
        Character player = new Character(20, 2, "Gilbert");
        Character ennemie = new Character(10, 3, "Tymother");
    
        // loop
        boolean turn = false;//n'importe quoi


        while (turn == false) { // tours
            while (turn == false) { // choix attaque
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Voulez-vous attaquer?");
    
                String choice = myObj.nextLine();  // Read user input
    
                choice = choice.toUpperCase();

                System.out.println(choice);
                if ("YES".equals(choice)) {
                    turn = true;
                }
                
            }
            
            turn = false;

            
            //enemie attack
            ennemie.setHealth(player.attack());
            
            if (player.getHealth() > 0) {
                player.setHealth(ennemie.attack()); 
            }

            if(player.getHealth() <= 0) {
                turn = true;
            }
            if (ennemie.getHealth() <= 0) {
                turn = true;
            } 

            System.out.println("Player: \nstrength: " + player.getStrength() + "\nhealth: " + player.getHealth() + "\nname: " + player.getName());
            System.out.println("Mob: \nstrength: " + ennemie.getStrength() + "\nhealth: " + ennemie.getHealth() + "\nname: " + ennemie.getName());
        }
    }
}
