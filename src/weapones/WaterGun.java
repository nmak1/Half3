package weapones;

public class WaterGun extends Weapon {

    @Override
    public void shot(int i) {
        super.shot(i);
        System.out.println("Фють -Фють");
    }
}
