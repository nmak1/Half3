package weapones;

public class MachineGun extends Weapon {
    int shots ;
    int powerDefeat;
    public MachineGun(){

    }

    @Override
    public void shot(int i) {
        super.shot(i);
        System.out.println("Тра-та-та Тра-та");
    }

    @Override
    public String toString() {
        return "MachineGun";
    }
}
