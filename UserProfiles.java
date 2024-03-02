import java.io.Serializable;
import java.util.ArrayList;

public class UserProfiles implements Serializable{

    private ArrayList<String> userNamesArray = new ArrayList<>(); // need to be loaded from local

    public ArrayList<String> getUserNames() {
        return userNamesArray;
    }

    public void addUserName(String userName) {
        userNamesArray.add(userName);
    }
    public boolean isAlreadyTaken(String userName) {
        return userNamesArray.contains(userName);
    }
    public int getNumberOfUsers(){
        return userNamesArray.size();
    }
    
    
}
