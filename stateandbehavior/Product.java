package stateandbehavior;

import java.util.Objects;

public class Product {

    private String name;
    private int price;
    private int quantity;
    private String category;

    Product(String name, int price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock(){
        if (quantity > 0){
            return true;
        }
        return false;
    }

    public boolean isCategory(String category){
        if (Objects.equals(this.category, category)){
            return true;
        }
        return false;
    }

}
