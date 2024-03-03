import java.util.ArrayList;

/**
 * BuyCharacter
 */
public class BuyCharacter {
    public static void render(User currentUser){
        System.out.println("Welcome To Shop! spend your monye wisely!"); // funny pharses
        System.out.println("Which Charecter you want to buy?");
        System.out.println("1. Archer");
        System.out.println("2. Knight");
        System.out.println("3. Mage");
        System.out.println("4. Healer");
        System.out.println("5. Mythical Creature");
        System.out.println("Enter suitable number");

        int choice =  InputProcessor.getInt();
        if (choice == 1) {
            System.out.println("Which Archer you want to buy?");
            System.out.println("1. shooter from hillcr");
            System.out.println("2. ranger from ");
            System.out.println("3. sunfire from ");
            System.out.println("4. zing from");
            System.out.println("5. saggitarius from ");
            System.out.println("Enter suitable number");

            choice =  InputProcessor.getInt();

            if (choice == 1) {    
                currentUser.characters.add(Archer.makeShooter());
            }else if (choice == 2) {
                currentUser.characters.add(Archer.makeRanger());
            }else if (choice == 3) {
                currentUser.characters.add(Archer.makeSunFire());
            }else if (choice == 4) {
                currentUser.characters.add(Archer.makeZing());
            }else if (choice == 5) {
                currentUser.characters.add(Archer.makeSaggitarius());
            }else{
                // what do we do
            }
            System.out.println(currentUser.characters.get(0).getAttack());

        }else if (choice == 2) {
            
        }else if (choice == 3) {
            
        }else if (choice == 4) {
            
        }else if (choice == 5) {
            
        }else{
            // what do we do
        }
    }

}