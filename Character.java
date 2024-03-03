
//import java.util.ArrayList;
//import java.util.HashMap;

public class Character {
    private String name;
    private int price;
    private double attack, defence, health, speed;

    public Character(String name, int price, float attack, float defence, float health, float speed) {
        // a common constructor
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
    }

    public void printInfo() {
        System.out.printf("Name: %s\nPrice: %.1f Gold coins\nAttack: %.1f\nDefence: %.1f\nHealth: %.1f\nSpeed: %.1f\n",
                name, price, attack, defence, health, speed);
        // "Name: " + name + "\nPrice: " + price + " gc\nAttack: " + attack
        // + "\nDefence: " + defence + "\nHealth: " + defence + "\nSpeed: " + speed
    }

    public void attackOpponent(Character op) { // attacking procedure is same for most of the characters
        op.setHealth(op.getHealth() - (0.5 * this.getAttack() - op.getDefence()));
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getAttack() {
        return this.attack;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void assignEquipment(Equipment eq) {
        this.setPrice(this.getPrice() + (int) (0.2 * eq.getPrice()));
        this.setAttack(this.getAttack() + eq.getAttack());
        this.setDefence(this.getDefence() + eq.getDefence());
        this.setHealth(this.getHealth() + eq.getHealth());
        this.setSpeed(this.getSpeed() + eq.getSpeed());
    }

    public void removeEquipment(Equipment eq) {
        this.setPrice(this.getPrice() - (int) (0.2 * eq.getPrice()));
        this.setAttack(this.getAttack() - eq.getAttack());
        this.setDefence(this.getDefence() - eq.getDefence());
        this.setHealth(this.getHealth() - eq.getHealth());
        this.setSpeed(this.getSpeed() - eq.getSpeed());
    }

    public void changeEquipment(Equipment oldEq, Equipment newEq) {
        this.removeEquipment(oldEq);
        this.assignEquipment(newEq);
    }

    // creating the required characters as static objects
    // public static Archer shooter = new Archer("Shooter", 80, 11, 4, 6, 9);
    // public static Archer ranger = new Archer("Ranger", 115, 14, 5, 8, 10);
    // public static Archer sunfire = new Archer("Sunfire", 160, 15, 5, 7, 14);
    // public static Archer zing = new Archer("Zing", 200, 16, 9, 11, 14);
    // public static Archer saggitarius = new Archer("Saggitarius", 230, 18, 7, 12, 17);

    public static Knight squire = new Knight("Squire", 85, 8, 9, 7, 8);
    public static Knight cavalier = new Knight("Cavalier", 110, 10, 12, 7, 10);
    public static Knight templar = new Knight("Templar", 155, 14, 16, 12, 12);
    public static Knight zoro = new Knight("Zoro", 180, 17, 16, 13, 14);
    public static Knight swiftblade = new Knight("Swiftblade", 250, 18, 20, 17, 13);

    public static Mage warlock = new Mage("Warlock", 100, 12, 7, 10, 12);
    public static Mage illusionist = new Mage("Illusionist", 120, 13, 8, 12, 14);
    public static Mage enchanter = new Mage("Enchanter", 160, 16, 10, 13, 16);
    public static Mage conjurer = new Mage("Conjurer", 195, 18, 15, 14, 12);
    public static Mage eldritch = new Mage("Eldritch", 270, 19, 17, 18, 14);

    public static MythicalCreature dragon = new MythicalCreature("Dragon", 120, 12, 14, 15, 8);
    public static MythicalCreature basilisk = new MythicalCreature("Basilisk", 165, 15, 11, 10, 12);
    public static MythicalCreature hydra = new MythicalCreature("Hydra", 205, 12, 16, 15, 11);
    public static MythicalCreature phoenix = new MythicalCreature("Phoenix", 275, 17, 13, 17, 19);
    public static MythicalCreature pegasus = new MythicalCreature("Pegasus", 340, 14, 18, 20, 20);

    public static Healer soother = new Healer("Soother", 95, 10, 8, 9, 6);
    public static Healer medic = new Healer("Medic", 125, 12, 9, 10, 7);
    public static Healer alchemist = new Healer("Alchemist", 150, 13, 13, 13, 13);
    public static Healer saint = new Healer("Saint", 200, 16, 14, 17, 9);
    public static Healer lightbringer = new Healer("Lightbringer", 260, 17, 15, 19, 12);

    // differentiating characters accordingto the homegrounds
    // public static Character[] highLanders = { Character.shooter, Character.ranger, Character.cavalier,
    //         Character.enchanter, Character.zoro, Character.conjurer, Character.medic };
    // public static Character[] marshlanders = { Character.squire, Character.swiftblade, Character.warlock,
    //         Character.alchemist, Character.basilisk, Character.hydra };
    // public static Character[] sunchildren = { Character.sunfire, Character.zing, Character.templar, Character.soother,
    //         Character.lightbringer, Character.dragon, Character.phoenix };
    // public static Character[] mystics = { Character.saggitarius, Character.illusionist, Character.eldritch,
    //         Character.saint, Character.pegasus };

}

class Archer extends Character {
    private Archer(String name, int price, float attack, float defence, float health, float speed) {
        super(name, price, attack, defence, health, speed);
    }

    public static Archer makeShooter(){
        return new Archer("Shooter", 80, 11, 4, 6, 9);
    }
    public static Archer makeRanger(){
        return new Archer("Ranger", 115, 14, 5, 8, 10);
    }
    public static Archer makeSunFire(){
        return new Archer("Sunfire", 160, 15, 5, 7, 14);
    }
    public static Archer makeZing(){
        return new Archer("Zing", 200, 16, 9, 11, 14);
    }
    public static Archer makeSaggitarius(){
        return new Archer("Saggitarius", 230, 18, 7, 12, 17);
    }

}

class Knight extends Character {
    public Knight(String name, int price, float attack, float defence, float health, float speed) {
        super(name, price, attack, defence, health, speed);
    }

}

class Mage extends Character {
    public Mage(String name, int price, float attack, float defence, float health, float speed) {
        super(name, price, attack, defence, health, speed);
    }

}

class MythicalCreature extends Character {
    public MythicalCreature(String name, int price, float attack, float defence, float health, float speed) {
        super(name, price, attack, defence, health, speed);
    }

}

class Healer extends Character {
    public Healer(String name, int price, float attack, float defence, float health, float speed) {
        super(name, price, attack, defence, health, speed);
    }

    @Override
    public void attackOpponent(Character ally) {
        ally.setHealth(0.1 * this.getAttack());
    }

}
