import java.io.IOException;
import java.io.InvalidClassException;
import java.util.*;
import java.io.Serializable;

public class Randomuser implements Serializable{
    private static final long serialVersionUID = 1L;
    public static User randomchooser(User username,ArrayList<String> userlist) throws ClassNotFoundException, IOException{
        if(userlist.size()==0){
            return username;
        }
        Collections.shuffle(userlist);
        String randomname = userlist.get(0);
        User randomUser = Handlefile.readUserFile(randomname);
        
        if(!randomUser.validArmy()){
            userlist.remove(randomname);
            return randomchooser(username, userlist);
        }else{
            return randomUser;
        }


    }
    public static User getrandomUser(User user) throws ClassNotFoundException, IOException,InvalidClassException{
        ArrayList<String> userlist = Handlefile.readUserProfiles("UserProfile").getUserNames();
        userlist.remove(user.getUserName());
        if(userlist.size()==0){
            return user;
        }
        User randomUser = randomchooser(user, userlist);
        if(randomUser.getUserName().equals(user.getUserName())){
            return user;
        }
        
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