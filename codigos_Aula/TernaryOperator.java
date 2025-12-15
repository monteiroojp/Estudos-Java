package codigos_Aula;
import java.util.Scanner;
import java.util.Locale;

public class TernaryOperator {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digit the price of the item: ");
        double price = sc.nextDouble();

        double discount = price > 500? 0.3*price : 0.1*price;
        System.out.printf("Discount: %.2f", discount);

        sc.close();;
    }
}
