import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.util.Scanner;

/**
 * Created by holdenhughes on 10/8/15.
 */
public class Game {
    static Player player;

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the my text adventure");
        player = new Player();
        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();
        player.findItem("apple");

        Enemy ogre = new Enemy("Ogre", 50, 5);
        player.battle(ogre);

    }
    static String nextLine() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.startsWith("/")) {
            System.out.println("Command:");
            if (s.equals("/Help")) {
                System.out.println("These are the available commands:");
                System.out.println("/help ==> Lis available commands");
            } else if (s.equals("/Exit")) {
                System.exit(0);
            } else if (s.equals("/inv")) {
                if (player.items.size() ==0){
                    System.out.println("You have no items");
                }
                for (Object item : player.items) {
                    System.out.println(item);
                }
            }
            return nextLine();
        } else {
            return s;
        }
    }
}
