import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Isosceles Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter Height of Isosceles Triangle: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.printf("Area of Isosceles Triangle is: %.2f\n", area);
        sc.close();
    }
}
