package practicesPOO.practice3.exercise1;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Insert the values for the rectangle: \nHeight: ");
        rectangle.height = sc.nextDouble();
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();

        //Area
        System.out.printf("Area = %.2f%n", rectangle.getArea());

        //Perimeter
        System.out.printf("Perimeter = %.2f%n", rectangle.getPerimeter());

        //Diagonal
        System.out.printf("Diagonal = %.2f%n", rectangle.getDiagonal());
    }
}
