import java.util.Scanner;

public class _1_AddingTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = false;
        do{
            System.out.print("Enter First Number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.println("The sum of two numbers is: "+sum);
            System.out.print("Do you want repeat again: ");
            again = scanner.nextBoolean();
        }while(again);
        scanner.close();
    }
}
