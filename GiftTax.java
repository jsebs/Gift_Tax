
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Ask for value of gift
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());

        //Calculate tax% depending on range of value and print amount due in tax
        if (value >= 5000 && value <= 24999) {
            double tax = (100 + (value - 5000)*.08);
            System.out.println("Tax: " + tax);
        }else if (value >=25000 && value <= 49999) {
            double tax = (1700 + (value - 25000)*.10);
            System.out.println(("Tax: " + tax));
        }else if (value >=55000 && value <= 199999) {
            double tax = (4700 + (value - 55000)*.12);
            System.out.println("Tax: " + tax);
        }else if (value >=200000 && value <= 999999) {
            double tax = (22100 + (value - 200000)*.15);
            System.out.println("Tax: " + tax);
        }else if (value >=1000000) {
            double tax = (142100 + (value - 1000000)*.17);
            System.out.println("Tax: " + tax);
        }else if (value >= 0 && value <= 4999) {
            System.out.println("No tax!");
        }
    }
}
