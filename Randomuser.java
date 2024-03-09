import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.Serializable;

public class Randomuser implements Serializable{
    private static final long serialVersionUID = 1L;
    private static UserProfiles savedProfiles = null;
    public static ArrayList<String> getuserlist() throws IOException, ClassNotFoundException {
        Path currentRelativePath = Paths.get("");
        String workingDir = currentRelativePath.toAbsolutePath().toString();

        //boolean doesExists = new File(workingDir + "/UserProfile.ser").isFile();

        FileInputStream FileIn = new FileInputStream(workingDir + "/UserProfile.ser"); // need to get path dynamically
        ObjectInputStream in = new ObjectInputStream(FileIn);
        savedProfiles = (UserProfiles) in.readObject();
        ArrayList<String> userlist = savedProfiles.getUserNames();
        in.close();
        FileIn.close();
        return userlist;
    }
    public static User getrandomUser(User user) throws ClassNotFoundException, IOException,InvalidClassException{
        ArrayList<String> userlist = getuserlist();
        userlist.remove(user.getUserName());
        if(userlist.size()==0){
            return user;
        }
        Collections.shuffle(userlist);
        String randomname = userlist.get(0);
        Path currentRelativePath = Paths.get("");
        String workingDir = currentRelativePath.toAbsolutePath().toString();

        //boolean doesExists = new File(workingDir + randomname+".ser").isFile();

        FileInputStream FileIn11 = new FileInputStream(workingDir + "/"+randomname+".ser"); // need to get path dynamically
        ObjectInputStream in11 = new ObjectInputStream(FileIn11);
        User randomUser = (User) in11.readObject();
        in11.close();
        FileIn11.close();
        System.out.println("random opponent : "+randomUser.getName());
        randomUser.getuserinfo();
        System.out.print("\n1 > declare war with "+randomUser.getName()+"\n2 > show another player\nchoose correct number : ");
        String choise = InputProcessor.getString();
        System.out.println("\n");
        switch (choise) {
        case "1":
            return randomUser;
        default:
            return getrandomUser(user);
        }

    }
}