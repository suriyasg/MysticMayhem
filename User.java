import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class User implements Serializable {
    private String name;
    private String userName;
    private int userID;
    private String homeLand;
    private int coins;
    private int XP;
    // last Login ??

    public ArrayList<Character> characters = new ArrayList<>(Collections.nCopies(5, null));;
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
    
    public void getuserinfo(){
        System.out.println("Name : "+getName()+"\nXP   : "+getXP()+"\nGold Coins : "+getCoins());
        System.out.println("Names of Warriors :");
        for(Character ch:characters){
            System.out.println(ch.getName());
        }
    }

    public void buyCharacter(Character character) {
        int remainingCoins = getCoins() - character.getPrice();
        if (remainingCoins < 0) {
            System.out.println("You don't have enough money to buy this character");
        } else {
            setCoins(remainingCoins);
            if (this.characters.get(character.getPos()) == null) {
                characters.remove(character.getPos());
                characters.add(character.getPos(), character);
                System.out.println("Your current balance : " + getCoins() + " Gold coins.");
            } else {
                System.out.println("You Already Have a warrior in this category!! Please Sell it or Exchange it");
            }
        }

    }

    public void sellCharacter(Character character) {
        int currentValue = (int) (character.getPrice() * 0.9);
        this.setCoins(this.getCoins() + currentValue);
        this.characters.remove(character);
        this.characters.add(character.getPos(), null); // adding null element as a placeholder
        System.out.println("Your current balance : " + getCoins() + " Gold coins.");
    }

    public void changeCharacter(Character oldChar, Character newChar) {
        if (oldChar.equals(null)) {
            return;
        }
        if (oldChar.getName().equals(newChar.getName())) {
            System.out.println("Cannot Exchange Same character");
            return;
        }
        if (newChar.getPrice() > (this.getCoins() + (int) (oldChar.getPrice() * 0.9))) {
            System.out.println("Not Enough Money to Make the Exchange!!!!!");
            return;
        }
        System.out.println("Selling " + oldChar.getName());
        this.sellCharacter(oldChar);
        System.out.println("Buying " + newChar.getName());
        this.buyCharacter(newChar);
    }

    public void buyEquipment(Character luckyCharater, Equipment equipment) {
        int remainingCoins = getCoins() - equipment.getPrice();
        if (remainingCoins < 0) {
            System.out.println("You don't have enough money to buy this equipment");
        } else {
            setCoins(remainingCoins);
            luckyCharater.changeArmour(equipment);
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
