import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateArmy {
    public static void render(User currentUser) throws ClassNotFoundException, IOException {
        if (currentUser.characters.size() == 5) {
            System.err.println(
                    "You have already Created your army!! Please select Edit option in MainMenu to edit your Army!!");
            MainMenu.render(currentUser.getUserName());
            return;
        }
        System.out.println("You Have been given 500 Gold Coins");
        System.out.println(
                "To Enter a war you should have Each character from 5 Catogaries [Archer,Knight,Mage,Healer,MythicalCreatures]");

        System.out.println("A Default Army is given for You");
        System.out.println("Your Army Will be Assigned Shortly....");
        System.out.println("You are Given Shooter(80 GC)");
        Archer dShooter = new Archer("Shooter", 80, 11, 4, 6, 9);
        currentUser.buyCharacter(dShooter);
        System.out.println("You are Given Squire(85 GC)");
        Knight dSquire = new Knight("Squire", 85, 8, 9, 7, 8);
        currentUser.buyCharacter(dSquire);
        System.out.println("You are Given Warlock(100 GC)");
        Mage dWarlock = new Mage("Warlock", 100, 12, 7, 10, 12);
        currentUser.buyCharacter(dWarlock);
        System.out.println("You are Given Soother(95 GC)");
        Healer dSoother = new Healer("Soother", 95, 10, 8, 9, 6);
        currentUser.buyCharacter(dSoother);
        System.out.println("You are Given Dragon(120 GC)");
        MythicalCreature dDragon = new MythicalCreature("Dragon", 120, 12, 14, 15, 8);
        currentUser.buyCharacter(dDragon);

        System.out.println(
                "Your Army: \nArcher -> Shooter\nKnight -> Squire\nMage -> Warlock\nHealer -> Soother\nMystical Creature -> Dragon");
        System.out.println("You can edit your army as you Earn Coins in matches. :-)");

        FileOutputStream currentUserFile = new FileOutputStream(currentUser.getUserName() + ".ser");
        ObjectOutputStream currentUserOut = new ObjectOutputStream(currentUserFile);
        currentUserOut.writeObject(currentUser);
        currentUserOut.close();
        currentUserFile.close();
        MainMenu.render(currentUser.getUserName());

    }
}
