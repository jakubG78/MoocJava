
public class Main {

    public static void main(String[] args) {
//        Test your Debt class here 

        Debt mortgage = new Debt(1500.0, 2.0);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.waitOneYear();

//        mortgage.printBalance();
//
//        int years = 0;
//
//        while (years < 20) {
//            mortgage.waitOneYear();
//            years = years + 1;
//        }

        mortgage.printBalance();
    }
}
