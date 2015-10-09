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
        Scanner scanner = new Scanner (System.in);
        name = scanner.nextLine();
        System.out.println("Good Luck, " + name);
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up sword");
        System.out.println("[2] Pick up mallet");
        Scanner scanner = new Scanner (System.in);
        weapon = scanner.nextLine();
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
        Scanner scanner = new Scanner (System.in);
        String area = scanner.nextLine();
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
