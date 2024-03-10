import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;


public class LogIn {
    private static String Loggeduser;

    public static String render() throws IOException, ClassNotFoundException {
        Path currentRelativePath = Paths.get("");
        String workingDir = currentRelativePath.toAbsolutePath().toString();

        boolean doesExists = new File(workingDir + "/UserProfile.ser").isFile();
        if (!doesExists) {
            UserProfiles dummyUsers = new UserProfiles();
            // dummyUsers.addUserName("Suriya1");
            // dummyUsers.addUserName("Suriya2");
            // dummyUsers.addUserName("Suriya3");

            FileOutputStream userProfileFile = new FileOutputStream("UserProfile.ser");
            ObjectOutputStream userProfileOut = new ObjectOutputStream(userProfileFile);
            userProfileOut.writeObject(dummyUsers);
            userProfileOut.close();
            userProfileFile.close();
        }

        UserProfiles savedProfiles = Handlefile.readUserProfiles();

        System.out.println("Welcome To Log In Page!");
        System.out.print("Enter your user name :");
        String userName = InputProcessor.getString();

        if (savedProfiles.isAlreadyTaken(userName)) {
            Loggeduser = userName;
            System.out.println("Welcome back " + userName);
        } else {
            System.out.println(
                    "Oops 😅," + userName + " User name not found, try entering correct one if you have one already");
            System.out.println("if you want to create account press y");
            System.out.println("if you want to try log in again press r");
            System.out.println("if you want to exit the game press any other letters");
            String answer = InputProcessor.getString();

            if (answer.toUpperCase().equals("Y")) {
                return SignUp.render();
            } else if (answer.toUpperCase().equals("R")) {
                return LogIn.render();
            } else {
                System.out.println("Really? 🫢, Bye! 👋");
                return null; // ends the program will it?
            }
        }
        return Loggeduser;
    }
}
