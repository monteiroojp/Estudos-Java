package practicesPOO.practice6.exercise1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] products = new Product[n];
        for(int i=0; i<products.length; i++){
            sc.nextLine(); //Clears the buffer
            String name = sc.nextLine();
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double media = 0.0;
        for(int i=0; i<products.length; i++) media += products[i].getPrice();

        System.out.printf("AVERAGE PRICE = %.2f", media/products.length);

        sc.close();
    }
}
