package codigos_Aula;
import java.util.Scanner;
import java.util.Locale;

public class DoWhileLoop {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Exercise(Output the temperature in Fahrenheit from an input in Celsius)
        char choice;
        do{
            System.out.print("Digit the temperature in Celsius: ");
            double c = sc.nextDouble();
            System.out.printf("Equivalent in Fahrenheit: %.1f%n", (9*c/5)+32);
            System.out.print("Do you want to continue (y/n)? ");
            choice = sc.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');

        sc.close();
    }
}
