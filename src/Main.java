import weapones.*;

import java.util.Scanner;

import static java.lang.System.in;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Player player = new Player();
        player.weapons[0] = new Pistol();
        player.weapons[1] = new MachineGun();
        player.weapons[2] = new Granatamet();
        player.weapons[3] = new Slingshot();
        player.weapons[4] = new WaterGun();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        for (int i = 0; i < player.weapons.length; i++) {
            System.out.println("Слот " + i + "-" + player.weapons[i]);

        }


        while (true) {
            int slot = scanner.nextInt();
            if (slot == -1) {
                break;
            } else player.shotWithWeapon(slot);


            System.out.println("Стреляем дальше ");

        }
        System.out.println(" Game over ");

    }
}


