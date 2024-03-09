import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Warface {

    private static void takeoffence(String nameofattacker,int turn,int j,ArrayList<Character> attack,ArrayList<Character> deffend){
            System.out.println("Turn "+(turn+1)+": Name of Attacking Player :- "+nameofattacker);
            ArrayList<Character> aao = ArmySort.SortWarior("speed", attack);
            ArrayList<Character> ado = ArmySort.SortWarior("health", attack);
            ArrayList<Character> ddo = ArmySort.SortWarior("health", deffend);
            Character offencer = attack.get(attack.indexOf(aao.get(j)));
            Character deffencer = deffend.get(deffend.indexOf(ddo.get(0)));
            if(offencer.getClass().getSimpleName().equals("Healer")){
                offencer.attackOpponent(attack.get(attack.indexOf(ado.get(0))));
                if(deffencer.getHealth()<=0){
                    System.out.println(ddo.get(0).getName()+" is died!");
                    deffend.remove(ddo.get(0));
                    //flag++;
                }
            }else if(Landbonus.check(Landbonus.Highlanders, offencer.getName())){
                offencer.attackOpponent(deffencer);
                if(deffencer.getHealth()<=0){
                    System.out.println(ddo.get(0).getName()+" is died!");
                    deffend.remove(ddo.get(0));
                    ddo.remove(ddo.get(0));
                    //flag++;
                }
                if(ddo.size()<=0){
                    return ;
                }
                Character bonuswarior = new Character("bonusattacker", 0, 0.2*offencer.getAttack(), 0, 0, 0);
                bonuswarior.attackOpponent(deffend.get(deffend.indexOf(ddo.get(0))));
                if(deffencer.getHealth()<=0){
                    System.out.println(ddo.get(0).getName()+" is died!");
                    deffend.remove(ddo.get(0));
                    //flag++;
                }
            }else if(Landbonus.check(Landbonus.Mystics,offencer.getName())){
                offencer.setHealth(offencer.getHealth()+0.1*offencer.getHealth());
                offencer.attackOpponent(deffencer);
                if(deffencer.getHealth()<=0){
                    System.out.println(ddo.get(0).getName()+" is died!");
                    deffend.remove(ddo.get(0));
                    //flag++;
                }
                
            }else{
                offencer.attackOpponent(deffencer);
                if(deffencer.getHealth()<=0){
                    System.out.println(ddo.get(0).getName()+" is died!");
                    deffend.remove(ddo.get(0));
                    //flag++;
                }
            }
            return;
    }
        
    static void declareWar(User attacker) throws ClassNotFoundException, IOException,InvalidClassException{
        User deffender = Randomuser.getrandomUser(attacker);
        if(deffender.getUserName().equals(attacker.getUserName())){
            System.out.println("Sorry there are no opponent exist to play");
            MainMenu.render(attacker.getUserName());
            return;
        }
        String warland = deffender.getHomeLand();
        System.out.println("War Started ");
        ArrayList<Character> cpyatt = new ArrayList<>();
        for(Character c : attacker.characters){
            cpyatt.add(c);
        }
        ArrayList<Character> attackerWariors = Landbonus.setland(warland,attacker.characters);// Character shooter,templar,warlock,soother,dragon
        ArrayList<Character> deffenderWariors =Landbonus.setland(warland, deffender.characters);
        if(deffenderWariors.size()==0){
            System.out.println("\n\n"+attacker.getName()+" is won ");
            attacker.won((int)(0.2*deffender.getCoins()));
            deffender.setCoins(deffender.getCoins()-(int)(0.2*deffender.getCoins()));
        }else{
            int a=0 ,b=0;
            for(int j = 0 ; j<10;j++){
                a++;
                b++;
                if (a>=attackerWariors.size()){
                    a = 0;
                }
                if (b>=deffenderWariors.size()){
                    b = 0;
                }
                System.out.println("\n");
                takeoffence(attacker.getName(),j,a,attackerWariors,deffenderWariors);
                
                if(deffenderWariors.size() == 0){
                    System.out.println("\n\n"+attacker.getName()+" is won ");
                    attacker.won((int)(0.2*deffender.getCoins()));
                    deffender.setCoins(deffender.getCoins()-(int)(0.2*deffender.getCoins()));

                    break;
                }
                if (b>=deffenderWariors.size()){
                    b = 0;
                }
                System.out.println("\n");
                takeoffence(deffender.getName(),j,b,deffenderWariors,attackerWariors);
                if(attackerWariors.size() == 0){
                    System.out.println("\n\n"+deffender.getName()+" is won ");
                    deffender.won((int)(0.2*attacker.getCoins()));
                    attacker.setCoins(attacker.getCoins()-(int)(0.2*attacker.getCoins()));
                    break;
                }
                if (a>=attackerWariors.size()){
                    a = 0;
                }
                if(j==9){
                    System.out.println("\n\nDraw");
                }
            }

        }
        
        FileInputStream FileIn1 = new FileInputStream(attacker.getUserName()+".ser");
        ObjectInputStream in = new ObjectInputStream(FileIn1);
        User att = (User) in.readObject();
        in.close();
        FileIn1.close();
        FileInputStream FileIn2 = new FileInputStream(deffender.getUserName()+".ser"); 
        ObjectInputStream in1 = new ObjectInputStream(FileIn2);
        User deff = (User) in1.readObject();
        in1.close();
        FileIn2.close();
        attacker.characters = att.characters;
        deffender.characters = deff.characters;
        System.out.println(attacker.getName()+" XP : "+attacker.getXP()+" | gold coins : "+attacker.getCoins());
        System.out.println(deffender.getName()+" XP : "+deffender.getXP()+" | gold coins : "+deffender.getCoins()+"\n");
        FileOutputStream userProfileFileatt = new FileOutputStream(attacker.getUserName()+".ser");
        ObjectOutputStream userProfileOutatt = new ObjectOutputStream(userProfileFileatt);
        userProfileOutatt.writeObject(attacker);
        userProfileOutatt.close();
        userProfileFileatt.close();
        FileOutputStream userProfileFiledeff = new FileOutputStream(deffender.getUserName()+".ser");
        ObjectOutputStream userProfileOutdeff = new ObjectOutputStream(userProfileFiledeff);
        userProfileOutdeff.writeObject(deffender);
        userProfileOutdeff.close();
        userProfileFiledeff.close();
        MainMenu.render(attacker.getUserName());

        


    }
}
