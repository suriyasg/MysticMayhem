import java.util.*;

import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.IOException;
import java.io.InvalidClassException;

public class Warface {

    private static void takeoffence(String nameofattacker, int turn, int j, ArrayList<Character> attack,
            ArrayList<Character> deffend) {
        System.out.println("Turn " + (turn + 1) + ": Name of Attacking Player :- " + nameofattacker);
        ArrayList<Character> aao = ArmySort.SortWarior("speed", attack);
        ArrayList<Character> ado = ArmySort.SortWarior("health", attack);
        ArrayList<Character> ddo = ArmySort.SortWarior("health", deffend);
        Character offencer = attack.get(attack.indexOf(aao.get(j)));
        Character deffencer = deffend.get(deffend.indexOf(ddo.get(0)));
        if (offencer.getClass().getSimpleName().equals("Healer")) {
            offencer.attackOpponent(attack.get(attack.indexOf(ado.get(0))));
            if (deffencer.getHealth() <= 0) {
                System.out.println(ddo.get(0).getName() + " died!");
                deffend.remove(ddo.get(0));

            }
        } else if (Landbonus.check(Landbonus.Highlanders, offencer.getName())) {
            offencer.attackOpponent(deffencer);
            if (deffencer.getHealth() <= 0) {
                ConsoleStyler.printRedBold(ddo.get(0).getName() + " died!");
                deffend.remove(ddo.get(0));
                ddo.remove(ddo.get(0));

            }
            if (ddo.size() <= 0) {
                return;
            }
            Character bonuswarior = new Character("bonusattacker", 0, 0.2 * offencer.getAttack(), 0, 0, 0);
            bonuswarior.attackOpponent(deffend.get(deffend.indexOf(ddo.get(0))));
            if (deffencer.getHealth() <= 0) {
                ConsoleStyler.printRedBold(ddo.get(0).getName() + " died!");
                deffend.remove(ddo.get(0));

            }
        } else if (Landbonus.check(Landbonus.Mystics, offencer.getName())) {
            offencer.setHealth(offencer.getHealth() + 0.1 * offencer.getHealth());
            offencer.attackOpponent(deffencer);
            if (deffencer.getHealth() <= 0) {
                ConsoleStyler.printRedBold(ddo.get(0).getName() + " died!");
                deffend.remove(ddo.get(0));

            }
        } else {
            offencer.attackOpponent(deffencer);
            if (deffencer.getHealth() <= 0) {
                ConsoleStyler.printRedBold(ddo.get(0).getName() + " died!");
                deffend.remove(ddo.get(0));
            }
        }
        return;
    }

    static void declareWar(User attacker) throws ClassNotFoundException, IOException, InvalidClassException,
            UnsupportedAudioFileException, LineUnavailableException {
        User deffender = Randomuser.getrandomUser(attacker);
        if (deffender.getUserName().equals(attacker.getUserName())) {
            ConsoleStyler.printRedBold("Sorry there are no valid opponents exist to play");
            MainMenu.render(attacker.getUserName());
            return;
        }
        String warland = deffender.getHomeLand();
        ConsoleStyler.printYellowBold("War has Started ");
        ArrayList<Character> attackerWariors = Landbonus.setland(warland, attacker.characters);// Character
                                                                                               // shooter,templar,warlock,soother,dragon
        ArrayList<Character> deffenderWariors = Landbonus.setland(warland, deffender.characters);
        if (deffenderWariors.size() == 0) {
            ConsoleStyler.printGreenBold("\n\n" + attacker.getName() + " has won ");
            attacker.won((int) (0.2 * deffender.getCoins()));
            deffender.setCoins(deffender.getCoins() - (int) (0.2 * deffender.getCoins()));
        } else {
            int a = 0, b = 0;
            // Clip music = MusicPlayer.playMusic();
            // if (!music.equals(null)) {
            // music.start();
            // }

            for (int j = 0; j < 10; j++) {
                a++;
                b++;
                if (a >= attackerWariors.size()) {
                    a = 0;
                }
                if (b >= deffenderWariors.size()) {
                    b = 0;
                }
                System.out.println("\n");
                takeoffence(attacker.getName(), j, a, attackerWariors, deffenderWariors);

                if (deffenderWariors.size() == 0) {
                    ConsoleStyler.printGreenBold("\n\n" + attacker.getName() + " has won ");
                    attacker.won(deffender.getCoins());
                    deffender.setCoins(deffender.getCoins() - (int) (0.2 * deffender.getCoins()));

                    break;
                }
                if (b >= deffenderWariors.size()) {
                    b = 0;
                }
                System.out.println("\n");
                takeoffence(deffender.getName(), j, b, deffenderWariors, attackerWariors);
                if (attackerWariors.size() == 0) {
                    ConsoleStyler.printGreenBold("\n\n" + deffender.getName() + " has won ");
                    deffender.won(attacker.getCoins());
                    attacker.setCoins(attacker.getCoins() - (int) (0.2 * attacker.getCoins()));
                    break;
                }
                if (a >= attackerWariors.size()) {
                    a = 0;
                }
                if (j == 9) {
                    ConsoleStyler.printYellowBold("\n\nDraw");
                }
                /*
                 * try {
                 * Thread.sleep(3000);
                 * } catch (InterruptedException e) {
                 * e.printStackTrace();
                 * }
                 */
            }
            // if (!music.equals(null)) {
            // music.stop();
            // }
        }
        User att = Handlefile.readUserFile(attacker.getUserName());
        User deff = Handlefile.readUserFile(deffender.getUserName());
        attacker.characters = att.characters;
        deffender.characters = deff.characters;
        System.out.println(attacker.getName() + " XP : " + attacker.getXP() + " | gold coins : " + attacker.getCoins());
        System.out.println(
                deffender.getName() + " XP : " + deffender.getXP() + " | gold coins : " + deffender.getCoins() + "\n");
        Handlefile.writeUserFile(attacker);
        Handlefile.writeUserFile(deffender);
        MainMenu.render(attacker.getUserName());
    }
}
