import java.util.Scanner;

public class _2_Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total=0;  //total price
        System.out.println("Please enter number of items: ");
        int numberOfItems = scanner.nextInt();
        for (int i=0; i<numberOfItems; i++){
            System.out.println("Please enter cost of item "+(i+1));
            double price = scanner.nextDouble();
            total = total+price;
        }
        System.out.println("Total price is: "+total);
        scanner.close();
    }
}
