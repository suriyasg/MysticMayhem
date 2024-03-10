import java.io.IOException;

public class Attic {
    public static void render(User currentUser) throws IOException{
        if (currentUser.characters.size() == 0) {
            System.out.println("You have to buy some charaters first");
            return;
        }

        System.out.println(currentUser.getName() + ", Welcome to attic, you have "+ currentUser.getCoins() + " spend it wisely");
        System.out.println("Which charater going to get the gift? (if you are not sure why not visit your army or Attic details)"); 
        int i = 0;   
        for (Character character : currentUser.characters) {
            i++;
            System.out.println(i+". "+character.getName());
        }
        int choice = InputProcessor.getInt(1,i);  
        Character luckyCharater = currentUser.characters.get(choice-1);
        if (luckyCharater.hasArmour()) {
            System.out.println("This character has "+ luckyCharater.getArmour().getName() +" armour");
            System.out.println("if you buy new armour this will be discarded");
        } 
        if (luckyCharater.hasArtefact()) {
            System.out.println("This character has "+ luckyCharater.getArtefact().getName() +" artefact");
            System.out.println("if you buy new artefact this will be discarded");
        }
        System.out.println("What do you want to buy for " + luckyCharater.getName());
        System.out.println("1. Armour");
        System.out.println("2. Artefact");
        // handle when people give out of bound numbers via InputProcessor
        choice = InputProcessor.getInt(1,2);
        switch (choice) {
            case 1: // Armour
                System.out.println("Which Armour you want to buy?");
                System.out.println("1. Chainmail");
                System.out.println("2. Regalia");
                System.out.println("3. Fleece");
                choice = InputProcessor.getInt(1,3);
                switch (choice) {
                    case 1:
                        Armour newChainmail = new Armour("Chainmail",70,0,1,0,-1);
                        currentUser.buyEquipment(luckyCharater, newChainmail);
                        break;
                    case 2:
                        Armour newRegalia = new Armour("Regalia",105,0,1,0,0);
                        currentUser.buyEquipment(luckyCharater, newRegalia);
                        break;                    
                    case 3:
                        Armour newFleece = new Armour("Fleece",150,0,2,1,-1);
                        currentUser.buyEquipment(luckyCharater, newFleece);
                        break;
                
                    default:
                        break;
                }
                break;
            case 2: // artefact
                System.out.println("Which Artefact you want to buy?");
                System.out.println("1. Excalibur");
                System.out.println("2. Amulet");
                System.out.println("3. Crystal");
                choice = InputProcessor.getInt(1,3);
                switch (choice) {
                    case 1:
                        Armour newExcalibur = new Armour("Excalibur",150,2,0,0,0);
                        currentUser.buyEquipment(luckyCharater, newExcalibur);
                        break;
                    case 2:
                        Armour newAmulet = new Armour("Amulet",200,1,-1,1,1);
                        currentUser.buyEquipment(luckyCharater, newAmulet);
                        break;                    
                    case 3:
                        Armour newCrystal = new Armour("Crystal",210,2,1,-1,-1);
                        currentUser.buyEquipment(luckyCharater, newCrystal);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
            }

        
        if(luckyCharater.hasArmour())
            System.out.println("now your " + luckyCharater.getName() +" has  "+luckyCharater.getArmour().getName()); 
        if(luckyCharater.hasArtefact())
            System.out.println("now your " + luckyCharater.getName() +" has  "+luckyCharater.getArtefact().getName()); 

        
        Handlefile.writeUserFile(currentUser);
        return;
    }
}
