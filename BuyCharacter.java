import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * BuyCharacter
 */
public class BuyCharacter {
    public static void render(User currentUser) throws ClassNotFoundException, IOException {
        System.out.println(currentUser.getName() + ", Welcome To Our Shop! spend your monye wisely!"); // funny pharses
        System.out.println("Which Charecter you want to buy?");
        System.out.println("1. Archer");
        System.out.println("2. Knight");
        System.out.println("3. Mage");
        System.out.println("4. Healer");
        System.out.println("5. Mythical Creature");
        System.out.println("press 6 to go to main menu");
        System.out.println("Enter suitable number");

        int choice = InputProcessor.getInt();
        if (choice == 1) {
            System.out.println("Which Archer you want to buy?");
            System.out.println("1. Shooter from hillcr");
            System.out.println("2. Ranger from ");
            System.out.println("3. SunFire from ");
            System.out.println("4. Zing from");
            System.out.println("5. Saggitarius from ");
            System.out.println("press 6 to go back");
            System.out.println("Enter suitable number");

            choice = InputProcessor.getInt();

            if (choice == 1) {
                Archer newShooter = Archer.makeShooter();
                currentUser.buyCharacter(newShooter);
            } else if (choice == 2) {
                Archer newRanger = Archer.makeRanger();
                currentUser.buyCharacter(newRanger);
            } else if (choice == 3) {
                Archer newSunfire = Archer.makeSunFire();
                currentUser.buyCharacter(newSunfire);
            } else if (choice == 4) {
                Archer newZing = Archer.makeZing();
                currentUser.buyCharacter(newZing);
            } else if (choice == 5) {
                Archer saggitarius = Archer.makeSaggitarius();
                currentUser.buyCharacter(saggitarius);
            } else {
                BuyCharacter.render(currentUser);
            }

        } else if (choice == 2) {

        } else if (choice == 3) {

        } else if (choice == 4) {

        } else if (choice == 5) {

        } else {
            MainMenu.render(currentUser.getUserName());
        }

        FileOutputStream currentUserFile = new FileOutputStream(currentUser.getUserName() + ".ser");
        ObjectOutputStream currentUserOut = new ObjectOutputStream(currentUserFile);
        currentUserOut.writeObject(currentUser);
        currentUserOut.close();
        currentUserFile.close();
    }

}