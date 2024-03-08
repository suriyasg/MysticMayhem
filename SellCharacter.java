import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SellCharacter {
    public static void render(User currentUser) throws IOException {
        if (currentUser.characters.size() == 0) {
            System.out.println("You have to buy some charaters first 🙃");
            return;
        }

        System.out
                .println(currentUser.getName() + ", Welcome to Sell shop, you have " + currentUser.getCoins() + " now");
        System.out.println("Which chareter you want to sell off (You'll get 90 percent of it's value)");
        int i = 1;
        for (Character character : currentUser.characters) {
            System.out.println(i + ". " + character.getName());
            i++;
        }
        int choice = InputProcessor.getInt(1, i);

        Character unLuckyCharater = currentUser.characters.get(choice - 1);
        currentUser.sellCharacter(unLuckyCharater);

        FileOutputStream UserFile = new FileOutputStream(currentUser.getUserName() + ".ser");
        ObjectOutputStream UserOut = new ObjectOutputStream(UserFile);
        UserOut.writeObject(currentUser);
        UserOut.close();
        UserFile.close();
        System.out.println("Now you have, ");
        for (Character character : currentUser.characters) {
            if (character != null) {
                System.out.print(character.getName() + " ");
            } else {
                System.out.print("__________ ");
            }
        }
        System.out.println("");
        return;
    }
}
