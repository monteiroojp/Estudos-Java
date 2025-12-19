package practicesPOO.practice2;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());

        /*Object methods*/

        //Gets the datatype of the object
        System.out.println(product.getClass());

        //Compares if two objects are equals
        Product product1 = new Product();
        product1.quantity = 10;
        product1.price = 800.0;
        product1.name = "Xbox";
        Product product2 = new Product();
        product2.quantity = 10;
        product2.price = 800.0;
        product2.name = "Xb0x";
        System.out.println(product1.equals(product2));

        //Hashcode of the object
        System.out.println(product1.hashCode());

        //toString
        System.out.println(product1.toString());

        sc.close();
    }
}
