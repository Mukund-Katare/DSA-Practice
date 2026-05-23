import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter time(years): ");
        double t = sc.nextDouble();
        System.out.print("Enter Rate(%): ");
        double r = sc.nextDouble();

        double interest = (p * t * r) / 100;

        System.out.println("--------------------------------------");
        System.out.print("Simple Interest is: " + interest);

        sc.close();
    }
}
