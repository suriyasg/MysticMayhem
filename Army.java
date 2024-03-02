/**
 * Army
 */

enum TRIBE{
    Highlanders, 
    Marshlanders, 
    SunChildren,
    Mystics
}

enum WARRIOR{
    Shooter, Ranger, Cavalier, Zoro, Enchanter, Conjurer, Medic, // Highlanders
    Squire, Swiftblade, Warlock, Alchemist, Basilisk, Hydra, // Marshlanders
    Sunfire, Zing, Templar, Soother, Lightbringer, Dragon, Phoenix, // Sunchildren
    Saggitarius, Illusionist, Eldritch, Saint, Pegasus // Mystics
} 
enum CATEGORY{
    ARCHER, KNIGHT, MAGE, HEALER, MYTHICAL_CREATURE
}
public class Army {
    private WARRIOR name;
    private TRIBE tribe;
    private CATEGORY category;

    private double price;
    private double defence;
    private double health;
    private double speed;


    public Army(WARRIOR name, double price, double defence, double health, double speed, TRIBE tribe) {
        this.name = name;
        this.price = price;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
        this.tribe = tribe;
    }
    
    public WARRIOR getName() {
        return name;
    }
    public void setName(WARRIOR name) {
        this.name = name;
    }
    public TRIBE getTribe() {
        return tribe;
    }
    public void setTribe(TRIBE tribe) {
        this.tribe = tribe;
    }    
    public CATEGORY getCategory() {
        return category;
    }
    public void setCategory(CATEGORY category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
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
}