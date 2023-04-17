package homeworkcurs7.exercise1;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.setAdvertiser(new Facebook());
        company.publishAnAdvertisment();
        company.payForTheAd();

        Company company2 = new Company();
        company2.setAdvertiser(new Email());
        company2.publishAnAdvertisment();
        company2.payForTheAd();
    }
}
