/**
 * Created by Администратор on 15.11.2015.
 */
public class SportCar extends  Car implements TrackRace{
    public static final int speed = 190;

    @Override
    void startRace() {
        System.out.println("Sport Car going with speed = " + speed);
    }

    @Override
    public void sportDriving() {
        System.out.println("It is going on sport track. It will be champion!");
    }
}
