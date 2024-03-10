import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SignUp {
    // private static UserProfiles profiles = new UserProfiles();

    private static UserProfiles savedProfiles = null;

    public static String render() throws IOException, ClassNotFoundException {
        Path currentRelativePath = Paths.get("");
        String workingDir = currentRelativePath.toAbsolutePath().toString();

        boolean doesExists = new File(workingDir + "/UserProfile.ser").isFile();
        if (!doesExists) {
            UserProfiles dummyUsers = new UserProfiles();
            // dummyUsers.addUserName("Suriya1");
            // dummyUsers.addUserName("Suriya2");
            // dummyUsers.addUserName("Suriya3");

            Handlefile.writeUserProfiles(dummyUsers);
        }

        savedProfiles = Handlefile.readUserProfiles();


        System.out.println("Welcome To Sign Up Page!");

        System.out.print("Enter your name :");

        String name = InputProcessor.getString();

        System.out.print("Enter your user name (you can not reset it later) :");
        String userName = InputProcessor.getString();
        while (savedProfiles.isAlreadyTaken(userName)) {
            System.out.println("User name is already taken! try a different one");
            System.out.print("Enter your user name (you can not reset it later) :");
            userName = InputProcessor.getString();
        }
        User newUser = new User(userName, savedProfiles.getNumberOfUsers() + 1);
        newUser.setName(name);
        // newUser.setUserName(userName); user name read-only once defined
        savedProfiles.addUserName(userName);


        System.out.println("Congrats, You are the " + savedProfiles.getNumberOfUsers() + " User!");
        System.out.println("Select your home land : this will give you some bonus to your army");
        ChangeHomeland.render(newUser);

        Handlefile.writeUserFile(newUser);
        Handlefile.writeUserProfiles(savedProfiles);


        System.out.println("User saved!");
        return userName;

    }
}
