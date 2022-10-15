package weapones;

 public class Pistol extends Weapon {
     int shots ;
     int powerDefeat;
     public Pistol(){

     }

    @Override
    public void shot(int i) {
        super.shot(i);
        System.out.println("Пив -Пав");
    }

     @Override
     public String toString() {
         return "Pistol" ;
     }
 }
