package stateandbehavior;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    Bottle(int totalCapacity,int availableLiquid,boolean open){
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public int getAvailableLiquid(){
        return availableLiquid;
    }

    public String openBottle(){
        if (open){
            return "Bottle is already open";
        }
        open = true;
        return "Bottle is opened";
    }

    public String closeBottle(){
        if (!open){
            return "Bottle is already closed";
        }
        open = false;
        return "Bottle is closed";
    }

    public String refillBottle(int refillQuantity) {
        if (open) {
            if (refillQuantity < 0){
                return "Quantity to refill must be positive";
            }
            availableLiquid = Math.min(totalCapacity, availableLiquid + refillQuantity);
            return refillQuantity +" was added";
        }
        return "Bottle is not open";
    }

    public String drinkLiquid(int quantityToDrink){
        if (open){
                if (availableLiquid>quantityToDrink) {
                    availableLiquid -= quantityToDrink;
                    return quantityToDrink + " has been drunk";
                }
                return "Bottle does not have enough liquid";
        }
        return "Bottle is not open";
    }

}
