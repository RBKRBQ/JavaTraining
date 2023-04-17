package homeworkcurs7.exercise2;

public class ING implements BankingServices{

    private double availableAmount = 1000;
    private int pin;

    @Override
    public String setPin(int pin) {
        this.pin = pin;
        return "Pin has been successfully set";
    }

    @Override
    public String withdrawMoney(int pin, double amount) {
        if( pin == this.pin) {
            if(amount < availableAmount){
                availableAmount -= amount;
                return "You have successfully withdrawn " + amount;
            }
            return "You do not have the necessary funds";
        }
        return "Pin is incorrect";
    }

    @Override
    public String depositMoney(int pin, double amount) {
        if( pin == this.pin) {
            availableAmount += amount;
            return "You have successfully deposited " + amount;
        }
        return "Pin is incorrect";
    }

    @Override
    public String checkAccount(int pin) {
        if( pin == this.pin) {
            return "Your account has "+ availableAmount + " amount available";
        }
        return "Pin is incorrect";
    }
}
