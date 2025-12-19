package practicesPOO.practice5.exercise1;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        System.out.printf("Product data: %s%n", product.toString());

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.printf("Updated data: %s%n", product.toString());

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.printf("Updated data: %s%n", product.toString());

        //Test setters and getters
        product.setName("Xbox");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(350.00);
        System.out.println("Updated price: " + product.getPrice());

        sc.close();
    }
}
