package TapAndGo;

public class TapAndGoCard {
    private double balance;
    private  double threshold;

    public TapAndGoCard(double threshold) {
        this.threshold = threshold;
    }
    public void pay(double payAmount) throws Exception {
if (payAmount > this.threshold) {
    throw new Exception("Payment is more than the Threshold");
}
        if(this.balance > payAmount) {
            this.balance -= payAmount;
        }else{
            throw new Exception("Insufficient funds transaction cannot be processed");
        }

    }
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }
    public double getBalance() {
        return balance;
    }
}
