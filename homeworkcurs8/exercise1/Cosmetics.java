package homeworkcurs8.exercise1;

public class Cosmetics extends Product{
    private String color;
    private int weight;

    public int getTotalWeight(int quantity){
        return quantity * weight;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
