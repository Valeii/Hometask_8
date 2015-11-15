/**
 * Created by Администратор on 15.11.2015.
 */
public class Truck extends  Car implements DrunkDriver {
    public static final int speed = 50;

    @Override
    void startRace() {
        System.out.println("Truck going with speed = " + speed);
    }

    @Override
    public void overDrunkDriving() {
        System.out.println("Ooooops! Our driver is alcoholic!");
    }
}
