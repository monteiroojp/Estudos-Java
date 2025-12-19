package practicesPOO.practice4.exercise2;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        CurrencyConverter.rate = sc.nextDouble();

        System.out.print("How many dollars will be bought: ");
        double value = sc.nextDouble();

        System.out.printf("Amount to be paid in BRL = %.2f", CurrencyConverter.dollarToReal(value));
    }
}
