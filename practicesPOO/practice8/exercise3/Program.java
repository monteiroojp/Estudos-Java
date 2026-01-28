package practicesPOO.practice8.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        List<Shape> shapes = new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.println("Shape #" + (i+1) + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char answer = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();

            if(answer == 'r' || answer == 'R'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                shapes.add(new Rectangle(Color.valueOf(color), width, height));
            }
            else if(answer == 'c' || answer == 'C'){
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapes.add(new Circle(Color.valueOf(color), radius));
            }
        }

        System.out.println("\nSHAPE AREAS");
        for(int i=0; i<n; i++) System.out.println(shapes.get(i).area());
    }
}
