package inheritance;

public class Bike {
    protected static int maxPressure = 10;
    protected int tyrePressure;
    private int speed;

    public Bike(int tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public void increaseSpeed(int amount){
        this.speed += amount;
    }

    public void increaseSpeed(){
        this.speed++;
    }
    public void stop() {
        this.speed = 0;
    }

    public void flatTyre(){
        System.out.println("Oops, my bike got a flat tyre!");
        this.tyrePressure = 0;
    }

    public final void inflateTyre(int amount) {
        tyrePressure += amount;
        if (tyrePressure > maxPressure){
            flatTyre();
        }
    }

    public int getTyrePressure() {
        return tyrePressure;
    }

    public int getSpeed() {
        return speed;
    }
}
