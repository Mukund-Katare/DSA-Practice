import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.printf("The perimeter of Circle is: %.2f\n" , perimeter);

        sc.close();
    }
}
