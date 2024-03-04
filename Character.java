import java.io.Serializable;

public class Character implements Serializable {
    private String name;
    private int price;
    private double attack, defence, health, speed;
    private Equipment armour;
    private Equipment artefact;

    public Character(String name, int price, double attack, double defence, double health, double speed) {
        // a common constructor
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
    }

    public void printInfo() {
        System.out.printf("Name: %s\nPrice: %d Gold coins\nAttack: %.1f\nDefence: %.1f\nHealth: %.1f\nSpeed: %.1f\n",
                name, price, attack, defence, health, speed);
        // "Name: " + name + "\nPrice: " + price + " gc\nAttack: " + attack
        // + "\nDefence: " + defence + "\nHealth: " + defence + "\nSpeed: " + speed
    }

    public void attackOpponent(Character op) { // attacking procedure is same for most of the characters
        op.setHealth(op.getHealth() - (0.5 * this.getAttack() - op.getDefence()));
    }

    public String getName() {
        return this.name;
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

    public Equipment getArmour() {
        return armour;
    }

    public Equipment getArtefact() {
        return artefact;
    }

    public boolean hasArmour(){
        if (this.armour != null) {
            return true;
        }
        return false;
    }

    public boolean hasArtefact(){
        if (this.artefact != null) {
            return true;
        }
        return false;
    }

    private void wearArmour(Equipment newArmour) {
        this.armour = newArmour;
        this.setPrice(this.getPrice() + (int) (0.2 * newArmour.getPrice()));
        this.setAttack(this.getAttack() + newArmour.getAttack());
        this.setDefence(this.getDefence() + newArmour.getDefence());
        this.setHealth(this.getHealth() + newArmour.getHealth());
        this.setSpeed(this.getSpeed() + newArmour.getSpeed());
    }

    private void equipArtefact(Equipment newArtefact) {
        this.artefact = newArtefact;
        this.setPrice(this.getPrice() + (int) (0.2 * newArtefact.getPrice()));
        this.setAttack(this.getAttack() + newArtefact.getAttack());
        this.setDefence(this.getDefence() + newArtefact.getDefence());
        this.setHealth(this.getHealth() + newArtefact.getHealth());
        this.setSpeed(this.getSpeed() + newArtefact.getSpeed());
    }

    private void removeArmour() {
        this.setPrice(this.getPrice() - (int) (0.2 * this.armour.getPrice()));
        this.setAttack(this.getAttack() - this.armour.getAttack());
        this.setDefence(this.getDefence() - this.armour.getDefence());
        this.setHealth(this.getHealth() - this.armour.getHealth());
        this.setSpeed(this.getSpeed() - this.armour.getSpeed());
        this.armour = null;
    }

    private void unequipArtefact() {
        this.setPrice(this.getPrice() - (int) (0.2 * this.artefact.getPrice()));
        this.setAttack(this.getAttack() - this.artefact.getAttack());
        this.setDefence(this.getDefence() - this.artefact.getDefence());
        this.setHealth(this.getHealth() - this.artefact.getHealth());
        this.setSpeed(this.getSpeed() - this.artefact.getSpeed());
        this.artefact = null;
    }

    public void changeArmour(Equipment newArmour) {
        if(this.hasArmour()){
            this.removeArmour();
            this.wearArmour(newArmour);
        }
        this.wearArmour(newArmour);
        return;
    }
    public void changeEquipment(Equipment newArtefact) {
        if (hasArtefact()) {
            this.unequipArtefact();
            this.equipArtefact(newArtefact);
        }
        this.equipArtefact(newArtefact);
        return;
    }

    // differentiating characters accordingto the homegrounds
    // public static Character[] highLanders = { Character.shooter,
    // Character.ranger, Character.cavalier,
    // Character.enchanter, Character.zoro, Character.conjurer, Character.medic };
    // public static Character[] marshlanders = { Character.squire,
    // Character.swiftblade, Character.warlock,
    // Character.alchemist, Character.basilisk, Character.hydra };
    // public static Character[] sunchildren = { Character.sunfire, Character.zing,
    // Character.templar, Character.soother,
    // Character.lightbringer, Character.dragon, Character.phoenix };
    // public static Character[] mystics = { Character.saggitarius,
    // Character.illusionist, Character.eldritch,
    // Character.saint, Character.pegasus };

}

class Archer extends Character {
    public Archer(String name, int price, double attack, double defence, double health, double speed) {
        super(name, price, attack, defence, health, speed);
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
