import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Diagonal (d1) of Rhombus: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter Second Diagonal (d2) of Rhombus: ");
        double d2 = sc.nextDouble();

        double area = 0.5 * d1 * d2;

        System.out.printf("Area of Rhombus is: %.2f\n", area);
        sc.close();
    }
}
