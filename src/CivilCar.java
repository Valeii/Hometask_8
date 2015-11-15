/**
 * Created by Администратор on 15.11.2015.
 */
public class CivilCar extends  Car  implements  FamilyDriver{
    public static final int speed = 70;
    @Override
    void startRace() {
        System.out.println("Сivil Car going with speed = " + speed);
    }

    @Override
    public void familyDriving() {
        System.out.println("Our driver is driving to Budapest with his his family");
    }
}
