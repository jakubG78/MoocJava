
public class Debt {

    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialIntrestRate) {
        this.balance = initialBalance;
        this.interestRate = initialIntrestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }
    
    public void waitOneYear(){
        this.balance = this.balance *this.interestRate;
    }
}
