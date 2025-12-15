package codigos_Aula;
import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args){
        //Values for testing
        double x = 3.0;
        double y = 9.0;
        double z = -5;

        //Pow
        System.out.println(x + " squared is " + Math.pow(x, 2));

        //Square root
        System.out.println("The square root of " + y + " is " + Math.sqrt(y));

        //Absolute value
        System.out.println("The absolute value of " + z + " is " + Math.abs(z));

        //Exercise(Calculate the square roots of an equation)
        Scanner sc = new Scanner(System.in);
        System.out.print("Digit the coefficients of the quadratic equation(a,b,c): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4*a*c;
        if(delta > 0){
           double x1 = (-b + Math.sqrt(delta)) / (2*a);
           double x2 = (-b - Math.sqrt(delta)) / (2*a);
           System.out.printf("x1: %.2f%nx2: %.2f%n", x1, x2);
        }
        else if(delta == 0){
            double x1 = -b / (2*a);
            System.out.printf("x: %.2f%n", x1);
        }
        else{
            System.out.print("There is no real root for this equation");
        }

        sc.close();
    }
}
