import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter your second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");

        char op = sc.next().charAt(0);
        double result;

        if(op == '+'){
            result = num1 + num2;
            System.out.print("Result: " + result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.print("Result: " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.print("Result: " + result);
        } else if (op == '/') {
            if(num2 != 0){
                result = num1 / num2;
                System.out.print("Result: " + result);
            }
            else {
                System.out.print("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.print("Invalid Operator!");
        }
        sc.close();
    }
}
