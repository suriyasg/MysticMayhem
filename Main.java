import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("-----------------------------");
        ConsoleStyler.printBlueBright("| Weclome to Mystic Mayhem! |");
        System.out.println("-----------------------------");
        ConsoleStyler.printBlue("1. Log1n    2. SignUp  3. exit game (Choose an appropriate number)");
        // read "About game, devs (us) 😅"2

        int choice = InputProcessor.getInt(1,3);

        String userName;
        if (choice == 1) {
            userName = LogIn.render();
        } else if (choice == 2) {
            userName = SignUp.render();
        }else{
            return;
        }

        if(userName == null){;
            return;
        } else {
            MainMenu.render(userName);
        }
        return;
    }
}
