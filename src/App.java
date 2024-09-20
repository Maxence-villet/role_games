import java.util.Scanner;
import Characters.Character;

public class App {
  
    public static void main(String[] args) throws Exception {
        
        // initialisation
        Character player = new Character(1, 2, "Gilbert", 3);
        Character ennemie = new Character(6, 3, "Tymother", 1);
    
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
                ennemie.toString();
                turn = true;
            } 
            // player.tostring();
            // ennemie.tostring();
        }
    }
}
