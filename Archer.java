package FactoryMethod;
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

public class Archer extends Army{

    private Archer(WARRIOR name, double price, double defence, double health, double speed, TRIBE tribe) {
        super(name, price, defence, health, speed, tribe);
    }

    public static Army makeShooter() {
        return new Archer(WARRIOR.Shooter,80.0,11.0,4.0,6.0,TRIBE.Highlanders);
    }
    
}
