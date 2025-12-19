package practicesPOO.practice4.exercise1;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        //Circumference
        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));

        //Volume
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));

        //PI value
        System.out.println("PI value: " + Calculator.PI);

        sc.close();
    }
}
