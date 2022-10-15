package weapones;

public class Granatamet extends Weapon {

    int shots ;
    int powerDefeat;
    public Granatamet(){

    }

    @Override
    public void shot(int i) {
        super.shot(i);
        System.out.println("ба -бах");
    }

    @Override
    public String toString() {
        return "Granatamet";
    }
}
