import java.io.IOException;

public class ExchangeCharacters {
    public static void render(User currentUser) throws IOException, ClassNotFoundException {
        System.out.println("You Have the following Characters in your army");
        MainMenu.printArmy(currentUser);

        System.out.println("Which Character Do you want to change: ");
        System.out.println("1. Archer");
        System.out.println("2. Knight");
        System.out.println("3. Mage");
        System.out.println("4. Healer");
        System.out.println("5. Mythical Creature");
        System.out.println("6. Return to MainMenu");
        System.out.print("Select your option:  ");
        int choice = InputProcessor.getInt(1, 6);
        switch (choice) {
            case 1:
                System.out.println(
                        "Which archer do you want to exchange with your exsisting archer? (Don't select your existing archer)");
                System.out.println("1. Shooter");
                System.out.println("2. Ranger");
                System.out.println("3. SunFire");
                System.out.println("4. Zing");
                System.out.println("5. Saggitarius");
                choice = InputProcessor.getInt(1, 5);
                Archer oldArcher = (Archer) currentUser.characters.get(0);
                switch (choice) {
                    case 1:
                        Archer shooter = new Archer("Shooter", 80, 11, 4, 6, 9);
                        currentUser.changeCharacter(oldArcher, shooter);
                        break;
                    case 2:
                        Archer ranger = new Archer("Ranger", 115, 14, 5, 8, 10);
                        currentUser.changeCharacter(oldArcher, ranger);
                        break;
                    case 3:
                        Archer sunfire = new Archer("Sunfire", 160, 15, 5, 7, 14);
                        currentUser.changeCharacter(oldArcher, sunfire);
                        break;
                    case 4:
                        Archer zing = new Archer("Zing", 200, 16, 9, 11, 14);
                        currentUser.changeCharacter(oldArcher, zing);
                        break;
                    case 5:
                        Archer saggitarius = new Archer("Saggitarius", 230, 18, 7, 12, 17);
                        currentUser.changeCharacter(oldArcher, saggitarius);
                        break;
                }
                ExchangeCharacters.render(currentUser);
            case 2:
                System.out.println(
                        "Which knight do you want to exchange with your exsisting archer? (Don't select your existing knight)");
                System.out.println("1.Squire");
                System.out.println("2.Cavalier ");
                System.out.println("3.Templar ");
                System.out.println("4.Zoro ");
                System.out.println("5.Swiftblade");
                System.out.println("press 6 to go back");
                System.out.print("Enter suitable number: ");
                choice = InputProcessor.getInt(1, 6);
                Knight oldKnight = (Knight) currentUser.characters.get(1);
                switch (choice) {
                    case 1:
                        Knight squire = new Knight("Squire", 85, 8, 9, 7, 8);
                        currentUser.changeCharacter(oldKnight, squire);
                        break;
                    case 2:
                        Knight cavalier = new Knight("Cavalier", 110, 10, 12, 7, 10);
                        currentUser.changeCharacter(oldKnight, cavalier);
                        break;
                    case 3:
                        Knight templar = new Knight("Templar", 155, 14, 16, 12, 12);
                        currentUser.changeCharacter(oldKnight, templar);
                        break;
                    case 4:
                        Knight zoro = new Knight("Zoro", 180, 17, 16, 13, 14);
                        currentUser.changeCharacter(oldKnight, zoro);
                        break;
                    case 5:
                        Knight swiftblade = new Knight("Swiftblade", 250, 18, 20, 17, 13);
                        currentUser.changeCharacter(oldKnight, swiftblade);
                        break;
                }
                ExchangeCharacters.render(currentUser);

            case 3:
                System.out.println(
                        "Which mage do you want to exchange with your exsisting archer? (Don't select your existing mage)");
                System.out.println("1.Warlock");
                System.out.println("2.Illusionist ");
                System.out.println("3.Enchnater ");
                System.out.println("4.Conjurer ");
                System.out.println("5.Eldritch");
                System.out.println("press 6 to go back");
                System.out.print("Enter suitable number: ");
                choice = InputProcessor.getInt(1, 6);
                Mage oldMage = (Mage) currentUser.characters.get(2);
                switch (choice) {
                    case 1:
                        Mage warlock = new Mage("Warlock", 100, 12, 7, 10, 12);
                        currentUser.changeCharacter(oldMage, warlock);
                        break;
                    case 2:
                        Mage illusionist = new Mage("Illusionist", 120, 13, 8, 12, 14);
                        currentUser.changeCharacter(oldMage, illusionist);
                        break;
                    case 3:
                        Mage enchanter = new Mage("Enchanter", 160, 16, 10, 13, 16);
                        currentUser.changeCharacter(oldMage, enchanter);
                        break;
                    case 4:
                        Mage conjurer = new Mage("Conjurer", 195, 18, 15, 14, 12);
                        currentUser.changeCharacter(oldMage, conjurer);
                        break;
                    case 5:
                        Mage eldritch = new Mage("Eldritch", 270, 19, 17, 18, 14);
                        currentUser.changeCharacter(oldMage, eldritch);
                        break;
                }
                ExchangeCharacters.render(currentUser);
            case 4:
                System.out.println(
                        "Which mage do you want to exchange with your exsisting archer? (Don't select your existing mage)");
                System.out.println("1.Soother");
                System.out.println("2.Medic");
                System.out.println("3.Alchemist");
                System.out.println("4.Saint");
                System.out.println("5.Lightbringer");
                System.out.println("press 6 to go back");
                System.out.print("Enter suitable number: ");
                choice = InputProcessor.getInt(1, 6);
                Healer oldHealer = (Healer) currentUser.characters.get(3);
                switch (choice) {
                    case 1:
                        Healer soother = new Healer("Soother", 95, 10, 8, 9, 6);
                        currentUser.changeCharacter(oldHealer, soother);
                        break;
                    case 2:
                        Healer medic = new Healer("Medic", 125, 12, 9, 10, 7);
                        currentUser.changeCharacter(oldHealer, medic);
                        break;
                    case 3:
                        Healer alchemist = new Healer("Alchemist", 150, 13, 13, 13, 13);
                        currentUser.changeCharacter(oldHealer, alchemist);
                        break;
                    case 4:
                        Healer saint = new Healer("Saint", 200, 16, 14, 17, 9);
                        currentUser.changeCharacter(oldHealer, saint);
                        break;
                    case 5:
                        Healer lightbringer = new Healer("Lightbringer", 260, 17, 15, 19, 12);
                        currentUser.changeCharacter(oldHealer, lightbringer);
                        break;
                }
                ExchangeCharacters.render(currentUser);
            case 5:
                System.out.println(
                        "Which mage do you want to exchange with your exsisting archer? (Don't select your existing mage)");
                System.out.println("1.Dragon");
                System.out.println("2.Basilisk ");
                System.out.println("3.Hydra ");
                System.out.println("4.Phoenix ");
                System.out.println("5.Pegasus");
                System.out.println("press 6 to go back");
                System.out.print("Enter suitable number: ");
                choice = InputProcessor.getInt(1, 6);
                MythicalCreature oldCreature = (MythicalCreature) currentUser.characters.get(4);
                switch (choice) {
                    case 1:
                        MythicalCreature dragon = new MythicalCreature("Dragon", 120, 12, 14, 15, 8);
                        currentUser.changeCharacter(oldCreature, dragon);
                        break;
                    case 2:
                        MythicalCreature basilisk = new MythicalCreature("Basilisk", 165, 15, 11, 10, 12);
                        currentUser.changeCharacter(oldCreature, basilisk);
                        break;
                    case 3:
                        MythicalCreature hydra = new MythicalCreature("Hydra", 205, 12, 16, 15, 11);
                        currentUser.changeCharacter(oldCreature, hydra);
                        break;
                    case 4:
                        MythicalCreature phoenix = new MythicalCreature("Phoenix", 275, 17, 13, 17, 19);
                        currentUser.changeCharacter(oldCreature, phoenix);
                        break;
                    case 5:
                        MythicalCreature pegasus = new MythicalCreature("Pegasus", 340, 14, 18, 20, 20);
                        currentUser.changeCharacter(oldCreature, pegasus);
                        break;
                }
                ExchangeCharacters.render(currentUser);
            case 6:
                MainMenu.render(currentUser.getUserName());
        }

        Handlefile.writeUserFile(currentUser);
    }
}
