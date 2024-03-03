public abstract class Equipment {
    private String name;
    private int price;
    private int attack;
    private int defence;
    private int health;
    private int speed;

    public Equipment(String name, int price, int attack, int defence, int health, int speed) {
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getPrice() {
        return price;
    }

    public int getDefence() {
        return defence;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }
}

class Armour extends Equipment {
    public Armour(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}

class Artefact extends Equipment {
    public Artefact(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}
