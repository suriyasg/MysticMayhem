import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * BuyCharacter
 */
public class BuyCharacter {
    public static void render(User currentUser) throws ClassNotFoundException, IOException{
        System.out.println(currentUser.getName()+", Welcome To Our Shop! spend your monye wisely!"); // funny pharses
        System.out.println("Which Charecter you want to buy?");
        System.out.println("1. Archer");
        System.out.println("2. Knight");
        System.out.println("3. Mage");
        System.out.println("4. Healer");
        System.out.println("5. Mythical Creature");
        System.out.println("press 6 to go to main menu");
        System.out.println("Enter suitable number");

        int choice =  InputProcessor.getInt();
        if (choice == 1) {
            System.out.println("Which Archer you want to buy?");
            System.out.println("1. Shooter from hillcr");
            System.out.println("2. Ranger from ");
            System.out.println("3. SunFire from ");
            System.out.println("4. Zing from");
            System.out.println("5. Saggitarius from ");
            System.out.println("press 6 to go back");
            System.out.println("Enter suitable number");

            choice =  InputProcessor.getInt();
            double remainingCoins;
            if (choice == 1) {    
                Archer newShooter = Archer.makeShooter();
                remainingCoins = currentUser.getCoins()-newShooter.getPrice();
                if(remainingCoins>=0){
                    currentUser.characters.add(newShooter);
                    currentUser.setCoins(remainingCoins);
                }else{
                    System.out.println("You are poor! you don't have enough money to buy lol");
                }
                System.out.println("Your current balance :" + currentUser.getCoins());
            }else if (choice == 2) {
                Archer newRanger = Archer.makeRanger();
                remainingCoins = currentUser.getCoins()-newRanger.getPrice();
                if(remainingCoins>=0){
                    currentUser.characters.add(newRanger);
                    currentUser.setCoins(remainingCoins);
                }else{
                    System.out.println("You are poor! you don't have enough money to buy lol");
                }
                System.out.println("Your current balance :" + currentUser.getCoins());
            }else if (choice == 3) {
                Archer newSunFire = Archer.makeSunFire();
                remainingCoins = currentUser.getCoins()-newSunFire.getPrice();
                if(remainingCoins>=0){
                    currentUser.characters.add(newSunFire);
                    currentUser.setCoins(remainingCoins);
                }else{
                    System.out.println("You are poor! you don't have enough money to buy lol");
                }
                System.out.println("Your current balance :" + currentUser.getCoins());
            }else if (choice == 4) {
                Archer newZing = Archer.makeZing();
                remainingCoins = currentUser.getCoins()-newZing.getPrice();
                if(remainingCoins>=0){
                    currentUser.characters.add(newZing);
                    currentUser.setCoins(remainingCoins);
                }else{
                    System.out.println("You are poor! you don't have enough money to buy lol");
                }
                System.out.println("Your current balance :" + currentUser.getCoins());
            }else if (choice == 5) {
                Archer newSaggitarius = Archer.makeSaggitarius();
                remainingCoins = currentUser.getCoins()-newSaggitarius.getPrice();
                if(remainingCoins>=0){
                    currentUser.characters.add(newSaggitarius);
                    currentUser.setCoins(remainingCoins);
                }else{
                    System.out.println("You are poor! you don't have enough money to buy lol");
                }
                System.out.println("Your current balance :" + currentUser.getCoins());
            }else{
                BuyCharacter.render(currentUser);
            }

        }else if (choice == 2) {
            
        }else if (choice == 3) {
            
        }else if (choice == 4) {
            
        }else if (choice == 5) {
            
        }else{
            MainMenu.render(currentUser.getUserName());
        }

        FileOutputStream currentUserFile = new FileOutputStream(currentUser.getUserName() + ".ser");
        ObjectOutputStream currentUserOut = new ObjectOutputStream(currentUserFile);
        currentUserOut.writeObject(currentUser);
        currentUserOut.close();
        currentUserFile.close();
    }


}