import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * BuyCharacter
 */
public class BuyCharacter {
    public static void render(User currentUser) throws ClassNotFoundException, IOException {
        System.out.println(currentUser.getName() + ", Welcome To Our Shop! spend your money wisely!"); // funny pharses
        System.out.println("Which Charecter you want to buy?");
        System.out.println("1. Archer");
        System.out.println("2. Knight");
        System.out.println("3. Mage");
        System.out.println("4. Healer");
        System.out.println("5. Mythical Creature");
        System.out.println("press 6 to go to main menu");
        System.out.println("Enter suitable number");

        int choice = InputProcessor.getInt(1, 6);
        if (choice == 1) {
            System.out.println("Which Archer you want to buy?");
            System.out.println("1. Shooter");
            System.out.println("2. Ranger");
            System.out.println("3. SunFire");
            System.out.println("4. Zing");
            System.out.println("5. Saggitarius");
            System.out.println("press 6 to go back");
            System.out.print("Enter suitable number");

            choice = InputProcessor.getInt(1, 6);

            switch (choice) {
                case 1:
                    Archer shooter = new Archer("Shooter", 80, 11, 4, 6, 9);
                    currentUser.buyCharacter(shooter);
                    break;
                case 2:
                    Archer ranger = new Archer("Ranger", 115, 14, 5, 8, 10);
                    currentUser.buyCharacter(ranger);
                    break;
                case 3:
                    Archer sunfire = new Archer("Sunfire", 160, 15, 5, 7, 14);
                    currentUser.buyCharacter(sunfire);
                    break;
                case 4:
                    Archer zing = new Archer("Zing", 200, 16, 9, 11, 14);
                    currentUser.buyCharacter(zing);
                    break;
                case 5:
                    Archer saggitarius = new Archer("Saggitarius", 230, 18, 7, 12, 17);
                    currentUser.buyCharacter(saggitarius);
                    break;
                default:
                    BuyCharacter.render(currentUser);
            }

        } else if (choice == 2) {
            System.out.println("Which Knight you want to buy?");
            System.out.println("1.Squire");
            System.out.println("2.Cavalier ");
            System.out.println("3.Templar ");
            System.out.println("4.Zoro ");
            System.out.println("5.Swiftblade");
            System.out.println("press 6 to go back");
            System.out.print("Enter suitable number: ");
            choice = InputProcessor.getInt(1, 6);

            switch (choice) {
                case 1:
                    Knight squire = new Knight("Squire", 85, 8, 9, 7, 8);
                    currentUser.buyCharacter(squire);
                    break;
                case 2:
                    Knight cavalier = new Knight("Cavalier", 110, 10, 12, 7, 10);
                    currentUser.buyCharacter(cavalier);
                    break;
                case 3:
                    Knight templar = new Knight("Templar", 155, 14, 16, 12, 12);
                    currentUser.buyCharacter(templar);
                    break;
                case 4:
                    Knight zoro = new Knight("Zoro", 180, 17, 16, 13, 14);
                    currentUser.buyCharacter(zoro);
                    break;
                case 5:
                    Knight swiftblade = new Knight("Swiftblade", 250, 18, 20, 17, 13);
                    currentUser.buyCharacter(swiftblade);
                    break;
                default:
                    BuyCharacter.render(currentUser);
            }

        } else if (choice == 3) {
            System.out.println("Which Mage you want to buy?");
            System.out.println("1.Warlock");
            System.out.println("2.Illusionist ");
            System.out.println("3.Enchnater ");
            System.out.println("4.Conjurer ");
            System.out.println("5.Eldritch");
            System.out.println("press 6 to go back");
            System.out.print("Enter suitable number: ");
            choice = InputProcessor.getInt(1, 6);

            switch (choice) {
                case 1:
                    Mage warlock = new Mage("Warlock", 100, 12, 7, 10, 12);
                    currentUser.buyCharacter(warlock);
                    break;
                case 2:
                    Mage illusionist = new Mage("Illusionist", 120, 13, 8, 12, 14);
                    currentUser.buyCharacter(illusionist);
                    break;
                case 3:
                    Mage enchanter = new Mage("Enchanter", 160, 16, 10, 13, 16);
                    currentUser.buyCharacter(enchanter);
                    break;
                case 4:
                    Mage conjurer = new Mage("Conjurer", 195, 18, 15, 14, 12);
                    currentUser.buyCharacter(conjurer);
                    break;
                case 5:
                    Mage eldritch = new Mage("Eldritch", 270, 19, 17, 18, 14);
                    currentUser.buyCharacter(eldritch);
                    break;
                default:
                    BuyCharacter.render(currentUser);
            }

        } else if (choice == 4) {
            System.out.println("Which Healer you want to buy?");
            System.out.println("1.Soother");
            System.out.println("2.Medic");
            System.out.println("3.Alchemist");
            System.out.println("4.Saint");
            System.out.println("5.Lightbringer");
            System.out.println("press 6 to go back");
            System.out.print("Enter suitable number: ");
            choice = InputProcessor.getInt(1, 6);

            switch (choice) {
                case 1:
                    Healer soother = new Healer("Soother", 95, 10, 8, 9, 6);
                    currentUser.buyCharacter(soother);
                    break;
                case 2:
                    Healer medic = new Healer("Medic", 125, 12, 9, 10, 7);
                    currentUser.buyCharacter(medic);
                    break;
                case 3:
                    Healer alchemist = new Healer("Alchemist", 150, 13, 13, 13, 13);
                    currentUser.buyCharacter(alchemist);
                    break;
                case 4:
                    Healer saint = new Healer("Saint", 200, 16, 14, 17, 9);
                    currentUser.buyCharacter(saint);
                    break;
                case 5:
                    Healer lightbringer = new Healer("Lightbringer", 260, 17, 15, 19, 12);
                    currentUser.buyCharacter(lightbringer);
                    break;
                default:
                    BuyCharacter.render(currentUser);
            }

        } else if (choice == 5) {
            System.out.println("Which Mythical Creature you want to buy?");
            System.out.println("1.Dragon");
            System.out.println("2.Basilisk ");
            System.out.println("3.Hydra ");
            System.out.println("4.Phoenix ");
            System.out.println("5.Pegasus");
            System.out.println("press 6 to go back");
            System.out.print("Enter suitable number: ");
            choice = InputProcessor.getInt(1, 6);

            switch (choice) {
                case 1:
                    MythicalCreature dragon = new MythicalCreature("Dragon", 120, 12, 14, 15, 8);
                    currentUser.buyCharacter(dragon);
                    break;
                case 2:
                    MythicalCreature basilisk = new MythicalCreature("Basilisk", 165, 15, 11, 10, 12);
                    currentUser.buyCharacter(basilisk);
                    break;
                case 3:
                    MythicalCreature hydra = new MythicalCreature("Hydra", 205, 12, 16, 15, 11);
                    currentUser.buyCharacter(hydra);
                    break;
                case 4:
                    MythicalCreature phoenix = new MythicalCreature("Phoenix", 275, 17, 13, 17, 19);
                    currentUser.buyCharacter(phoenix);
                    break;
                case 5:
                    MythicalCreature pegasus = new MythicalCreature("Pegasus", 340, 14, 18, 20, 20);
                    currentUser.buyCharacter(pegasus);
                    break;
                default:
                    BuyCharacter.render(currentUser);
            }

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