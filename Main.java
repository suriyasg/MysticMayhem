import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        System.out.println("Weclome to Mystic MAhem!");
        System.out.println("1. Log1n    2. SignUp (Choose an appropriate number)");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            LogIn.render();
        }else{
            SignUp.render();
        }
        scanner.close();
    }
}
