import java.util.ArrayList;

/**
 * Created by holdenhughes on 10/9/15.
 */
public class Player extends Character {
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
        int weaponNum = Integer.valueOf(Game.nextLine());
        if (weaponNum == 1){
            weapon = new Weapon();
            weapon.name = "Sword";
            weapon.damage = 10;

        } else if (weaponNum == 2){
            weapon = new Weapon();
            weapon.name = "Mallet";
            weapon.damage = 10;
        } else {
            throw new Exception("Invalid weapon");
        }
        System.out.println(String.format("That's a fine %s!", weapon.name.toLowerCase()));
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
