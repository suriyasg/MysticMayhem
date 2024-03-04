import java.util.Scanner;

public class InputProcessor {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Please Enter a Number: ");
            return getInt();
        }

    }

    public static String getString() {
        String nexString = scanner.nextLine();
        return nexString;
    }

}
