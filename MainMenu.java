import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.Scanner;

public class MainMenu {
    // public static Scanner input = new Scanner(System.in);

    public static int getUserInput() {
        System.out.flush();
        int choice = 0;

        System.out.print("Press suitable option :");
        if (Main.universalScanner.hasNext()) {
            choice = Integer.parseInt(Main.universalScanner.next());
            Main.universalScanner.nextLine();
        } else {
            System.out.print("Error!!! Uable to get input.");
        }

        return choice;
    }

    public static void render(String userName) throws IOException, ClassNotFoundException {

        Path currentRelativePath = Paths.get("");
        String workingDir = currentRelativePath.toAbsolutePath().toString();

        boolean doesExists = new File(workingDir + "/" + userName + ".ser").isFile();
        if (!doesExists) {
            System.out.println("User Files are missing!"); // update message to somewhat formal
            return;
        }

        FileInputStream FileIn = new FileInputStream(workingDir + "/" + userName + ".ser"); // need to get path
                                                                                            // dynamically
        ObjectInputStream in = new ObjectInputStream(FileIn);
        User currentUser = (User) in.readObject();
        in.close();
        FileIn.close();

        System.out.println(currentUser.getName() + " HomeLand : 🏞️ " + currentUser.getHomeLand());
        System.out.println("Coins : " + currentUser.getCoins());
        System.out.println("Army : " + currentUser.army + "\n");

        System.out.println("1. Buy or Sell charecters");
        System.out.println("2. Change Homeland");
        System.out.println("3. Search for opponents");
        System.out.println("or to Exit press any other char");

        int choice = getUserInput();
        if (choice == 1) {
            // buy sell charectors
            System.out.println("do that");
        } else if (choice == 2) {
            // change home land
        } else if (choice == 3) {
            // War!!! or Retreat
        } else {
            // input.close();
            return;
        }
        // input.close();
        return;

    }
}
