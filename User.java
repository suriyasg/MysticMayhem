import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
    private String name;
    private String userName;
    private int userID;
    private int coins;
    // last Login ??

    public ArrayList<Army> army;

    public User(int id) {
        this.coins = 500;
        this.userID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
