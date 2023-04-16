package stateandbehavior;

public class Lamp {
    private boolean lightState; //this is a state, it is non-static

    private String color;
    private int intensity;

    Lamp(){
        System.out.println("starting constructor 1");
        lightState = false;
        color = "red";
        intensity=5;
    }

    Lamp(String color, int intensity){
        System.out.println("starting constructor with color "+ color+ " and intensity " + intensity);
        lightState = false;
        this.color = color;
        this.intensity= intensity;
    }

    public void turnOn(){ //this is a behavior, it is non-static
        System.out.println("turning on with color " + color + " with intensity " + intensity);
        lightState = true; //we change the state using the behavior
    }

    public void turnOff(){
        System.out.println("turning off");
        lightState = false;
    }

    public void increaseIntensity(){
        this.intensity++;
    }

}
