import java.util.Scanner;

public class InputProcessor {
    private static Scanner scanner = new Scanner(System.in);

    // handle when people give out of bound numbers via InputProcessor by giving
    // parameters
    public static int getInt(int low, int high) {
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice >= low && choice <= high) {
                return choice;
            } else {
                System.out.print("Please Enter a Number within range: ");
                return getInt(low, high);
            }
        } catch (NumberFormatException e) {
            System.out.print("Please Enter a Number: ");
            return getInt(low, high);
        }

    }

    public static String getString() {
        String nextString = scanner.nextLine();
        if (nextString.equals("") && nextString.trim().isEmpty()) {
            System.out.print("Please Enter a valid name:");
            return getString();
        }
        return nextString;
    }

}
