package weapones;

public class MachineGun extends Weapon {
    @Override
    public void shot(int i) {
        super.shot(i);
        System.out.println("Тра-та-та Тра-та");
    }
}
