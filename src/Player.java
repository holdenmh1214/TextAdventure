import java.util.Scanner;

/**
 * Created by holdenhughes on 10/9/15.
 */
public class Player {
    String name;
    String weapon;
    String area;

    void chooseName() {
        System.out.println("What is your name traveler?");
        name = Game.nextLine();
        System.out.println("Good Luck, " + name);
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up sword");
        System.out.println("[2] Pick up mallet");
        weapon = Game.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1){
            System.out.println("That's a fine sword");
        } else if (weaponNum == 2){
            System.out.println("That's a heavy mallet");
        } else {
            throw new Exception("Invalid weapon");
        }
    }

    void chooseArea() throws Exception {
        System.out.println("[1] Enter the Forest");
        System.out.println("[2] Enter the town");
        area = Game.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1){
            System.out.println("Entering the forest");
        } else if (areaNum == 2){
            System.out.println("Entering the town");
        } else {
            throw new Exception(("Invalid area"));
        }
    }
}
