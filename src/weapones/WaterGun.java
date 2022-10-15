package weapones;

public class WaterGun extends Weapon {
    int shots ;
    int powerDefeat;
    public WaterGun(){

    }


    @Override
    public void shot(int i) {
        super.shot(i);
        System.out.println("Фють -Фють");
    }

    @Override
    public String toString() {
        return "WaterGun";
    }
}
