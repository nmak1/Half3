import weapones.*;

import java.util.Arrays;

public class Player {

    protected Weapon [] weapons = new Weapon[5];

    public Player (){


    }


    public int getSlotsCount() {
        return weapons.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 0 || (slot > weapons.length)) {
            System.out.println("такого оружия нет");
        } else {
            Weapon weapon = weapons[slot];
            weapon.shot(slot);
        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "weapons=" + Arrays.toString(weapons) +
                '}';
    }
}
