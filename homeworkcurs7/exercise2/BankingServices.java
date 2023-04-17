package homeworkcurs7.exercise2;

public interface BankingServices {
    String withdrawMoney(int pin, double amount);
    String depositMoney(int pin, double amount);
    String checkAccount(int pin);
    String setPin(int pin);

}
