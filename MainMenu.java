import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainMenu {
    public static void render(String userName) throws IOException, ClassNotFoundException {

        Path currentRelativePath = Paths.get("");
        String workingDir = currentRelativePath.toAbsolutePath().toString();

        boolean doesExists = new File(workingDir + "/" + userName + ".ser").isFile();
        if (!doesExists) {
            System.out.println("User Files are missing!"); // update message to somewhat formal
            return;
        }

        User currentUser = Handlefile.readUserFile(userName);

        System.out.println("-----------------------------");
        System.out.println("Welcome to Main Menu");
        System.out.println(currentUser.getName() + " HomeLand : 🏞️ " + currentUser.getHomeLand());
        System.out.println("Coins : " + currentUser.getCoins());
        System.out.println("-----------------------------");

        System.out.println("1 > Create Your Army (only do this if you are new user!)");
        System.out.println("2 > Change Homeland");
        System.out.println("3 > view your Army");
        System.out.println("4 > Edit your Army");
        System.out.println("5 > Go to war !!!!");
        System.out.println("6 > Exit");

        System.out.println("-----------------------------");
        System.out.print("> ");
        int choice = InputProcessor.getInt(1, 7);

        switch (choice) {
            case 1:
                // BuyCharacter.render(currentUser);
                CreateArmy.render(currentUser);
                break;
            case 2:
                ChangeHomeland.render(currentUser);
                break;
            case 3:
                MainMenu.printArmy(currentUser);
                break;
            case 4:
                System.out.println("1. Change Characters in your army");
                System.out.println("2. Buy Or Discard Equipments");
                choice = InputProcessor.getInt(1, 4);
                switch (choice) {
                    case 1:
                        ExchangeCharacters.render(currentUser);
                        break;
                    case 2:
                        Attic.render(currentUser);
                        break;

                    default:
                        return;
                }
                break;
            case 5:
                if (currentUser.validArmy()) {
                    Warface.declareWar(currentUser);

                } else {

                    System.out.println(
                            "you can't declare war because you must have 5 warriors" + currentUser.validArmy());
                    render(currentUser.getUserName());

                }
            case 6:
                Handlefile.writeUserFile(currentUser);
                System.exit(0);
            default:
                return;
        }
        MainMenu.render(currentUser.getUserName());
        return;
    }

    public static void printArmy(User CurrentUser) throws IOException, ClassNotFoundException {
        System.out.println("Characters at your service");
        System.out.println("---------------------------");

        for (Character soldier : CurrentUser.characters) {

            if (soldier != null) {
                soldier.printInfo();
            }

            System.out.println("-------------");
        }
        return;
    }
}
