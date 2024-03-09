import java.util.*;



public class Landbonus{
    public static String[] Highlanders = {"Shooter","Ranger", "Cavalier", "Zoro", "Enchanter","Conjurer", "Medic"};
    public static String[] Marshlanders = {"Squire", "Swiftblade", "Warlock", "Alchemist", "Basilisk", "Hydra"};
    public static String[] Sunchildren = {"Sunfire", "Zing", "Templar", "Soother", "Lightbringer", "Dragon", "Phoenix"};
    public static String[] Mystics = {"Saggitarius", "Illusionist", "Eldritch", "Saint", "Pegasus"};
    public static boolean check(String[] list,String value){
        for(String key:list){
            if (key.equals(value)) {
                return true;
            }
        }   
        return false;
    }
    public static ArrayList<Character> setland(String warland,ArrayList<Character> wariors) throws NullPointerException{
        if (warland == null) {
            throw new NullPointerException("Warland cannot be null");
        }
        ArrayList<Character> currentWarriors = new ArrayList<>(wariors);
        for(Character warior:currentWarriors){
            String wname = warior.getName();
            if (warland.equals("Hillcrest")){
                if(check(Highlanders, wname)){
                    warior.setAttack(warior.getAttack()+1);
                    warior.setDefence(warior.getDefence()+1);
                }else if(check(Marshlanders, wname)){
                    warior.setSpeed(warior.getSpeed()-1);
                }else if(check(Sunchildren, wname)){
                    warior.setSpeed(warior.getSpeed()-1);
                }
            }
            if (warland.equals("Marshland")){
                if(check(Marshlanders, wname)){
                    warior.setDefence(warior.getDefence()+2);
                }else if(check(Mystics, wname)){
                    warior.setSpeed(warior.getSpeed()-1);
                }else if(check(Sunchildren, wname)){
                    warior.setAttack(warior.getAttack()-1);
                }
            }
            if (warland.equals("Desert")){
                if(check(Marshlanders, wname)){
                    warior.setHealth(warior.getHealth()-1);
                }else if(check(Sunchildren, wname)){
                    warior.setAttack(warior.getAttack()+1);
                }
            }
            if (warland.equals("Arcane")){
                if(check(Mystics, wname)){
                    warior.setAttack(warior.getAttack()+2);
                }else if(check(Highlanders, wname)){
                    warior.setSpeed(warior.getSpeed()-1);
                    warior.setDefence(warior.getDefence()-1);
                }
            }
        }

        return currentWarriors;
    }
}