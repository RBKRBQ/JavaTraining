package homeworkCurs8.exercise1;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Cosmetics();
        products[0].setName("Handwash");
        products[0].setQuantity(100);
        products[1] = new Electronics();
        products[1].setName("Bosch");
        products[2] = new Fridge();
        products[2].setName("Bosch Fridge");
        products[2].setPrice(45.55);

        for (Product p : products){
            System.out.println(p.getName());
            System.out.println(p.getQuantity());
            System.out.println(p.getPrice());
        }

    }
}
