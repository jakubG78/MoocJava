
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scan.nextLine());
        double taxValue;
        if (valueOfGift > 1000000){
            taxValue = 142100 + (valueOfGift-1000000)*0.17;
            System.out.println(taxValue);
        }else if(valueOfGift <= 1000000 && valueOfGift > 200000) {
            taxValue = 22100 + (valueOfGift-200000)*0.15;
            System.out.println(taxValue);
        }else if(valueOfGift <= 200000 && valueOfGift > 55000){
            taxValue = 4700 + (valueOfGift-55000)*0.12;
            System.out.println(taxValue);
        }else if(valueOfGift <= 55000 && valueOfGift > 25000) {
            taxValue = 1700 + (valueOfGift-25000)*0.1;
            System.out.println(taxValue);
        }else if(valueOfGift <= 25000 && valueOfGift > 5000) {
            taxValue = 100 + (valueOfGift-5000)*0.08;
            System.out.println(taxValue);
        } else {
            System.out.println("No tax!");
        }
    }
}
