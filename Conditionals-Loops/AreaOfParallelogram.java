import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Parallelogram: ");
        double base = sc.nextDouble();
        System.out.print("Enter Height of Parallelogram: ");
        double height = sc.nextDouble();

        double area = base * height;

        System.out.printf("Area of Parallelogram is: %.2f\n", area);
        sc.close();
    }
}
