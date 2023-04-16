package interfaces;

public class McD implements FoodProvider{

    private static double pricePerItem = 15;
    private int quantity = 0;
    private double amountToPay = 0;


    @Override
    public boolean pay(double amount) {
        if (amount > 0 && amount <= amountToPay){
            amountToPay -= amount;
            System.out.println("McD was payed " + amount);
            return true;
        }
        return false;
    }

    @Override
    public String deliverFood() {
        quantity++;
        amountToPay += pricePerItem;
        return "burger";
    }

    @Override
    public int getDeliveredQuantity() {
        return quantity;
    }
}
