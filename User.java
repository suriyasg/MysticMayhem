import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String name;
    private String userName;
    private int userID;
    private String homeLand;
    private int coins;
    private int XP;
    // last Login ??

    public ArrayList<Character> characters = new ArrayList<>();
    public boolean hasValidArmy = (characters.size() == 5);

    public User(String userName, int id) {
        this.userName = userName;
        this.coins = 500;
        this.userID = id;
        this.XP = 1;
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

    public int getXP() {
        return XP;
    }

    public void incrementXP() {
        this.XP++;
    }

    public void buyCharacter(Character c) {
        int remainingCoins = getCoins() - c.getPrice();
        if (remainingCoins < 0) {
            System.out.println("You don't have enough money to buy this character");
        } else {
            setCoins(remainingCoins);
            characters.add(c);
        }
        System.out.println("Your current balance : " + getCoins() + " Gold coins.");

    }

    public void won(int enemyCoins) {
        this.coins += enemyCoins * 0.2;
        this.incrementXP();
    }

    public void lost() {
        this.coins -= this.coins * 0.2;
    }
}
