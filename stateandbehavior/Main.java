package stateandbehavior;

public class Main {

    public static void main(String[] args) {

        //Lamp
        Lamp lamp1 = new Lamp();
        lamp1.turnOn();

        Lamp customLamp = new Lamp("blue",10);
        customLamp.turnOn();
        customLamp.increaseIntensity();
        customLamp.turnOff();
        customLamp.turnOn();

        //Person
        Person person1 = new Person("Person One",37,true);
        Person person2 = new Person("Person Two",15,false);
        Person person3 = new Person("Person Three",25,false);

        System.out.println(person1.getName()+" "+person1.getAge()+" "+person1.isMarried());
        System.out.println(person2.getName()+" "+person1.getAge()+" "+person1.isMarried());
        System.out.println(person3.getName()+" "+person1.getAge()+" "+person1.isMarried());

        //Product
        Product product1 = new Product("Nike",25,100,"Shoe");
        Product product2 = new Product("Earl Grey",5,500,"Tea");
        Product product3 = new Product("Mars",10,0,"Chocolate");

        System.out.println(product2.getName()+" "+product2.getPrice()+" "+product2.getQuantity()+" "+product2.getCategory());
        System.out.println(product3.hasStock());
        System.out.println(product2.hasStock());
        System.out.println(product1.isCategory("Tea"));
        System.out.println(product1.isCategory("Shoe"));

         //Bottle
        Bottle bottleOpen = new Bottle(500,250,true);
        Bottle bottleClosed = new Bottle(500,250,false);
        Bottle bottleEmpty = new Bottle(0,0,true);

        System.out.println(bottleOpen.drinkLiquid(200));
        System.out.println(bottleClosed.drinkLiquid(200));
        System.out.println(bottleEmpty.drinkLiquid(200));


    }
}
