import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = sc.nextDouble();
        System.out.print("Enter Side: ");
        double side = sc.nextDouble();

        double perimeter = 2 * (base + side);

        System.out.printf("Perimeter of Parallelogram is: %.2f\n", perimeter);
        sc.close();
    }
}
