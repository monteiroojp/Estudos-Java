package practicesPOO.practice1;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the values of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the values of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.printf("Triangle x area: %.4f%nTriangle y area: %.4f%n", x.area(), y.area());

        if(x.area() > y.area())
            System.out.println("Larger area: x");
        else
            System.out.println("Larger area: y");

        sc.close();
    }
}
