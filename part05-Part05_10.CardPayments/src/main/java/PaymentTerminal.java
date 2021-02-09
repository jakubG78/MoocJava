
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.0;
        affordableMeals = 0;
        heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            money = money + 2.50;
            affordableMeals++;
            return payment - 2.50;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.50)) {
            affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            money = money + 4.30;
            heartyMeals++;
            return payment - 4.30;
        } else {
            return payment;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.30)) {
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
