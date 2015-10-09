import java.util.Scanner;

/**
 * Created by holdenhughes on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to the my text adventure");
        System.out.println("What is your name traveler?");

        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        System.out.println("Good Luck, " + name);

        System.out.println("[1] Pick up sword");
        System.out.println("[2] Pick up mallet");
        String weapon = scanner.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1){
            System.out.println("That's a fine sword");
        } else if (weaponNum == 2){
            System.out.println("That's a heavy mallet");
        } else {
            throw new Exception("Invalid weapon");
        }

        System.out.println("[1] Enter the Forest");
        System.out.println("[2] Enter the town");
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
