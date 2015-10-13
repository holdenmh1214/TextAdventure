import java.util.ArrayList;

/**
 * Created by holdenhughes on 10/9/15.
 */
public class Player extends Character {
    String weapon;
    String area;
    ArrayList items = new ArrayList();

    public Player(){
        health = 100;
        damage = 20;
    }

    void chooseName() {
        System.out.println("What is your name traveler?");
        name = Game.nextLine();
        System.out.println(String.format("Good Luck, %s",name));
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

    void findItem(String item) {
        System.out.println("Find item! Pick it up? [y/n]");
        String s = Game.nextLine();
        if (s.equals("y")) {
            System.out.println(String.format("You found a  %s", item));
            items.add(item);
        }
    }
}
