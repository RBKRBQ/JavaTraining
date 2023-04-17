package homeworkcurs7.exercise1;

public class Email implements Advertiser{
    private String ad;
    private double payment = 75;
    @Override
    public String publishAd(String ad) {
        if(ad.length()>0){
            return "Successfully published " + ad;
        }
        return "Please send an ad to be published";
    }

    @Override
    public boolean adPayment(double payment) {
        return payment == this.payment;
    }
}
