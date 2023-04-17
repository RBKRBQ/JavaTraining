package inheritance;

public class MountainBike extends Bike {
    private int suspensionStrength;
    public MountainBike() {
        super(6);
    }

    public int getSuspensionStrength() {
        return suspensionStrength;
    }

    @Override
    public void flatTyre() {
        System.out.println("This wheel was worth the money");
        tyrePressure = maxPressure;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "suspensionStrength=" + suspensionStrength +
                ", tyrePressure=" + tyrePressure +
                '}';
    }

    public void setSuspensionStrength(int suspensionStrength) {
        this.suspensionStrength = suspensionStrength;
    }
}
