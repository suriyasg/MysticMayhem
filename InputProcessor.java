import java.util.Scanner;

public class InputProcessor {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        String nexString = scanner.nextLine(); // what if user enter non numerical input
        return Integer.parseInt(nexString);
    }

    public static String getString(){
        String nexString = scanner.nextLine(); 
        return nexString;
    }

}
