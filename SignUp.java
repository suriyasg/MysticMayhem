import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class SignUp {
    private static Scanner scanner = new Scanner(System.in);
    // private static UserProfiles profiles = new UserProfiles();

    private static UserProfiles savedProfiles = null;

    public static String render() throws IOException, ClassNotFoundException{
        Path currentRelativePath = Paths.get("");
        String workingDir = currentRelativePath.toAbsolutePath().toString();

        boolean doesExists = new File(workingDir+"/UserProfile.ser").isFile();
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

        FileInputStream FileIn = new FileInputStream(workingDir+"/UserProfile.ser"); // need to get path dynamically
        ObjectInputStream in = new ObjectInputStream(FileIn);
        savedProfiles = (UserProfiles) in.readObject();
        in.close();
        FileIn.close();
    
        FileOutputStream userProfileFile = new FileOutputStream("UserProfile.ser");
        ObjectOutputStream userProfileOut = new ObjectOutputStream(userProfileFile);

        System.out.println("Welcome To Sign Up Page!");

        System.out.print("Enter your name :");
        String name = scanner.nextLine();
        User newUser = new User(savedProfiles.getNumberOfUsers()+1);
        newUser.setName(name);

        System.out.print("Enter your user name (you can not reset it later) :");
        String userName = scanner.nextLine();
        while(savedProfiles.isAlreadyTaken(userName)){
            System.out.println("User name is already taken! try a different one");
            System.out.print("Enter your user name (you can not reset it later) :");
            userName = scanner.nextLine();
        }
        newUser.setUserName(userName);
        savedProfiles.addUserName(userName);
        
        FileOutputStream newUserFile = new FileOutputStream(userName+".ser");
        ObjectOutputStream newUserOut = new ObjectOutputStream(newUserFile);

        System.out.println("Congrats, You are the " + savedProfiles.getNumberOfUsers() + " User!");

        newUserOut.writeObject(newUser);
        userProfileOut.writeObject(savedProfiles);

        newUserOut.close();
        newUserFile.close();

        userProfileOut.close();
        userProfileFile.close();
        scanner.close();
        System.out.println("User saved!");
        return userName;

    }
}
