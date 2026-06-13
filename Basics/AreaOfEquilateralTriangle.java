import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.printf("Area of Equilateral Triangle is: %.2f\n", area);
        sc.close();
    }
}
