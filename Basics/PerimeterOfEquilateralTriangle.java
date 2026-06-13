import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double side = sc.nextDouble();

        double perimeter = 3 * side;

        System.out.printf("Perimeter of Equilateral Triangle is: %.2f\n", perimeter);
        sc.close();
    }
}
