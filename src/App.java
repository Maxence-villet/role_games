import java.util.Scanner;
import java.util.Random;

import Characters.Character;

public class App {

    
    
    public static void main(String[] args) throws Exception {
        
        // initialisation
        Random rand = new Random();
        int randomNum = rand.nextInt((20 - 0) + 1);
        System.out.println(randomNum);
        Character player = new Character(4, 2, "Gilbert");
        Character ennemie = new Character(10, 3, "Tymother");
    
        // loop
        boolean turn = false;


        while (turn == false) { // tours
            while (turn == false) { // choix attaque
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Voulez-vous attaquer?");
    
                String choice = myObj.nextLine();  // Read user input
    
                choice = choice.toUpperCase();

                if ("YES".equals(choice)) {
                    turn = true;
                }     
            }
            
            turn = false;
            //enemie attack
            ennemie.setHealth(player.attack());
            
            if (ennemie.getHealth() > 0) {
                player.setHealth(ennemie.attack()); 
            }

            if(player.getHealth() <= 0) {
                turn = true;
            }
            if (ennemie.getHealth() <= 0) {
                turn = true;
            } 
            player.tostring();
            ennemie.tostring();
        }
    }
}
