import weapones.*;

import java.util.Scanner;

import static java.lang.System.in;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Player player = new Player();
        Weapon[] weapons = new Weapon[5];
        weapons[0] = new Pistol();
        weapons[1] = new MachineGun();
        weapons[2] = new Granatamet();
        weapons[3] = new Slingshot();
        weapons[4] = new WaterGun();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        System.out.println("Слот 0 - пистолет");
        System.out.println("Слот 1 - пулемет");
        System.out.println("Слот 2 - гранатамет");
        System.out.println("Слот 3 - рогатка");
        System.out.println("Слот 4 - водный пистолет");


        while (true) {
            int slot = scanner.nextInt();
            if (slot == -1) break;
            switch (slot) {
                case 0 -> player.shotWithWeapon(0);
                case 1 -> player.shotWithWeapon(1);
                case 2 -> player.shotWithWeapon(2);
                case 3 -> player.shotWithWeapon(3);
                case 4 -> player.shotWithWeapon(4);
                default -> player.shotWithWeapon(slot);
            }
            System.out.println("Стреляем дальше ");

        }
        System.out.println(" Game over ");

    }
}


