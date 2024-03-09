import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ChangeHomeland {
    public static void render(User CurrentUser) throws ClassNotFoundException, IOException {
        System.out.println("Welcome!" + CurrentUser.getName());
        System.out.println("Your Current HomeLand is " + CurrentUser.getHomeLand()
                + "\nPlease remeber that changing your Homeground may affect your performance");
        System.out.print(
                "Please Select your new Homeland\n1.Hillcrest\n2.Marshand\n3.Desert\n4.Arcane\nPlease Enter your input: ");
        int choice = InputProcessor.getInt(1,4);
        switch (choice) {
            case 1:
                CurrentUser.setHomeLand("Hillcrest");
                break;
            case 2:
                CurrentUser.setHomeLand("Marshland");
                break;
            case 3:
                CurrentUser.setHomeLand("Desert");
                break;
            case 4:
                CurrentUser.setHomeLand("Arcane");
                break;
            default:
                System.out.print("Please Enter a valid choice: ");
        }

        FileOutputStream currentUserFile = new FileOutputStream(CurrentUser.getUserName() + ".ser");
        ObjectOutputStream currentUserOut = new ObjectOutputStream(currentUserFile);
        currentUserOut.writeObject(CurrentUser);
        currentUserOut.close();
        currentUserFile.close();
        return;
    }
}
