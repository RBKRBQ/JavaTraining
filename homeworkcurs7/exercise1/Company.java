package homeworkcurs7.exercise1;

public class Company {
    private String ad = "This is an excellent company";
    private double payment;

    private Advertiser advertiser;

    public void setAdvertiser(Advertiser advertiser){this.advertiser = advertiser;}

    public void publishAnAdvertisment(){
        System.out.println(advertiser.publishAd(ad));
    }

    public void payForTheAd(){
        payment = 75;
        if(!advertiser.adPayment(payment)){
            System.out.println("Payment of 75 was too low, payed 150");
            payment = 150;
        } else {
            System.out.println("Payed 75");
            advertiser.adPayment(payment);
        }
    }

}
