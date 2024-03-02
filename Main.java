import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        System.out.println("Weclome to Mystic MAhem!");
        System.out.println("1. Log1n    2. SignUp  3. exit game (Choose an appropriate number)");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String userName;
        if (choice == 1) {
            userName = LogIn.render();
        }else if(choice == 2){
            userName = SignUp.render();
        }else{
            scanner.close();
            return;
        }
        scanner.close();
        if(userName == null){
            return;
        }else{
            MainMenu.render(userName);
        }


    }
}
