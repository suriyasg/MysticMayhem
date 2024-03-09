import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Handlefile {
    private static UserProfiles savedProfiles = null;
    private static Path currentRelativePath = Paths.get("");
    private static String workingDir = currentRelativePath.toAbsolutePath().toString();


    
    public static void writeUserProfiles(UserProfiles profile) throws IOException{

        FileOutputStream userProfileFile = new FileOutputStream("UserProfile.ser");
        ObjectOutputStream userProfileOut = new ObjectOutputStream(userProfileFile);
        userProfileOut.writeObject(profile);
        userProfileOut.close();
        userProfileFile.close();
    }


    public static UserProfiles readUserProfiles(String filename) throws ClassNotFoundException, IOException{
        FileInputStream FileIn = new FileInputStream(workingDir + "/"+filename+".ser");
        ObjectInputStream in = new ObjectInputStream(FileIn);
        savedProfiles = (UserProfiles) in.readObject();
        in.close();
        FileIn.close();
        return savedProfiles;
    }

    public static User readUserFile(String filename) throws ClassNotFoundException, IOException{
        FileInputStream FileIn11 = new FileInputStream(workingDir + "/"+filename+".ser");
        ObjectInputStream in11 = new ObjectInputStream(FileIn11);
        User user = (User) in11.readObject();
        in11.close();
        FileIn11.close();
        return user;

    }
    public static void writeUserFile(User user) throws IOException{
        FileOutputStream userProfileFileatt = new FileOutputStream(user.getUserName()+".ser");
        ObjectOutputStream userProfileOutatt = new ObjectOutputStream(userProfileFileatt);
        userProfileOutatt.writeObject(user);
        userProfileOutatt.close();
        userProfileFileatt.close();
        return;
    }

}
    

