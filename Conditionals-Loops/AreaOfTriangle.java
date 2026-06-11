import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter Height of Triangle: ");
        double height = sc.nextDouble();

        double areaOfTriangle = 0.5 * base * height;

        System.out.printf("Area of Triangle is: %.2f\n" , areaOfTriangle);

        sc.close();
    }
}
