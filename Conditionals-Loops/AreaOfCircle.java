import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double radius = sc.nextDouble();

        double areaOfCircle = Math.PI * radius * radius;

        System.out.printf("The Area of Circle is: %.2f\n" , areaOfCircle);

        sc.close();
    }
}
