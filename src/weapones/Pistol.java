package weapones;

 public class Pistol extends Weapon {
    @Override
    public void shot(int i) {
        super.shot(i);
        System.out.println("Пив -Пав");
    }
}
