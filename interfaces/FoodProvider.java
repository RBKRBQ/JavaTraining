package interfaces;

public interface FoodProvider {

//cum as putea interactiona cu un FoodProvider
//    descrie behavior-ul unei clase, nu avem field-uri

    boolean pay(double amount);
    String deliverFood();
    int getDeliveredQuantity();

}
