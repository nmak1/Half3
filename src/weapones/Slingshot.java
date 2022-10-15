package weapones;

public class Slingshot extends Weapon {
    int shots ;
    int powerDefeat;
    public Slingshot(){

    }

    @Override
    public void shot(int i) {
        super.shot(i);
        System.out.println("ШИХ");
    }

    @Override
    public String toString() {
        return "Slingshot";
    }
}
