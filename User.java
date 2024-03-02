import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
    private String name;
    private String userName;
    private int userID;
    private String homeLand;
    private int coins;
    // last Login ??

    public ArrayList<Army> army;

    public User(String userName, int id) {
        this.userName = userName;
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

    // public void setUserName(String userName) {
    //     this.userName = userName;
    // }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getHomeLand() {
        return homeLand;
    }

    public void setHomeLand(String homeLand) {
        this.homeLand = homeLand;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
