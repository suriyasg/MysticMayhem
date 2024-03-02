import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainMenu {
    public static void render(String userName) throws IOException, ClassNotFoundException{
        Path currentRelativePath = Paths.get("");
        String workingDir = currentRelativePath.toAbsolutePath().toString();

        boolean doesExists = new File(workingDir+"/"+userName+".ser").isFile();
        if (!doesExists) {
            System.out.println("User Files are missing!");
            return;
        }

        FileInputStream FileIn = new FileInputStream(workingDir+"/"+ userName +".ser"); // need to get path dynamically
        ObjectInputStream in = new ObjectInputStream(FileIn);
        User currentUser = (User) in.readObject();
        in.close();
        FileIn.close();

        System.out.println(currentUser.getName());
        System.out.println("Coins : "+currentUser.getCoins());
        System.out.println("Army : "+currentUser.army);


    }
}
