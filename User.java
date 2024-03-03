import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String name;
    private String userName;
    private int userID;
    private String homeLand;
    private int coins;
    // last Login ??

    public ArrayList<Character> characters = new ArrayList<>();

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
    // this.userName = userName;
    // }

    public int getUserID() {
        return userID;
    }

    /*
     * public void setUserID(int userID) {
     * this.userID = userID;
     * }
     */ // setUserId is not required since userID cannot be changed after instantiation

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

    public void buyCharacter(Character c) {
        int remainingCoins = getCoins() - c.getPrice();
        if (remainingCoins < 0) {
            System.out.println("You don't have enough money to buy this character");
        } else {
            setCoins(remainingCoins);
            characters.add(c);
        }
        System.out.println("Your current balance :" + getCoins() + " Gold coins.");

    }
}
