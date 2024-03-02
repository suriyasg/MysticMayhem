import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class LogIn {
    public static Scanner scanner = new Scanner(System.in);
    private static UserProfiles savedProfiles = null;

    public static void render() throws IOException, ClassNotFoundException{
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

        System.out.println("Welcome To Log In Page!");
        System.out.print("Enter your user name :");
        String name = scanner.nextLine();

        if(savedProfiles.isAlreadyTaken(name)){
            System.out.println("Welcome back " + name);
        }else{
            System.out.println("Opps 😅," + name +" User name not found, try entering correct one if you have one already");
            System.out.println("if you want to create account press y");
            System.out.println("if you want to try log in again press r");
            System.out.println("if you want to exit the game press any other letters");
            String answer = scanner.nextLine();

            if(answer.toUpperCase().equals("Y")){
                SignUp.render();
            }else if(answer.toUpperCase().equals("R")){
                LogIn.render();
            }else{
                System.out.println("Really? 🫢, Bye! 👋");
                return;  //ends the program will it?
            }
        }
        scanner.close();
    }
}
