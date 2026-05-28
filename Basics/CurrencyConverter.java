import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter INR: ");
        double inr = sc.nextDouble();

        double exchangeRate = 96.14; //ER of may 2026
        double usd = inr / exchangeRate;

        System.out.printf("Amount in USD: %.2f\n", usd);
        sc.close();
    }
}
