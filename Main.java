import java.util.Scanner;
import java.io.*;

public class Main {
    public static Scanner universalScanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Weclome to Mystic MAhem!");
        System.out.println("1. Log1n    2. SignUp  3. exit game (Choose an appropriate number)");
        // read "About game, devs (us) 😅"

        Scanner scanner = new Scanner(System.in);
        // what if user enter non numerical input
        int choice = Integer.parseInt(scanner.nextLine());

        String userName;
        if (choice == 1) {
            userName = LogIn.render();
        } else if (choice == 2) {
            userName = SignUp.render();
        } else {
            scanner.close();
            return;
        }

        if (userName == null) {
            scanner.close();
            return;
        } else {
            MainMenu.render(userName);
        }

        scanner.close();
        return;
    }
}
