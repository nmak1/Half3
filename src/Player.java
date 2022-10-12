import weapones.*;

public class Player {
    protected Weapon[] weaponSlots = new Weapon[]{new Pistol(), new MachineGun(),
            new Granatamet(), new Slingshot(), new WaterGun() };

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < -1 || slot > 4) {
            System.out.println("такого оружия нет");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot(slot);
        }

    }
}
