import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter your second number: ");
        double num2 = sc.nextDouble();

        if(num1 > num2){
            System.out.print(num1 + " is Largest");
        }
        else{
            System.out.print(num2 + " is Largest");
        }
        sc.close();
    }
}
