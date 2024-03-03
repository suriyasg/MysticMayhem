import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Weclome to Mystic MAhem!");
        System.out.println("1. Log1n    2. SignUp  3. exit game (Choose an appropriate number)");
        // read "About game, devs (us) 😅"

        int choice = InputProcessor.getInt();

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
