import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side of Square: ");
        double side = sc.nextDouble();

        double perimeter = 4 * side;

        System.out.printf("Perimeter of Square is: %.2f\n", perimeter);
        sc.close();
    }
}
