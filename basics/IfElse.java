package basics;
import java.util.Scanner;
import java.util.Locale;

public class IfElse {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double horas = sc.nextDouble();

        if(horas>=6 && horas<=12)
            System.out.println("Good morning");
        else if(horas>12 && horas<18)
            System.out.println("Good afternoon");
        else if((horas>=18 && horas<24) || (horas>=0 && horas <6))
            System.out.println("Good night");
        else
            System.out.println("Hours must be provide on interval [0,24)");

        //Exercise(Tax on salaries)
        double salary = sc.nextDouble();

        if(salary <= 2000)
            System.out.println("Insent");
        else if(salary > 2000 && salary <= 3000) {
            double tax = 0.08 * salary;
            System.out.printf("$ %.2f%n", tax);
        }
        else if(salary > 3000 && salary <= 4500){
            double tax = 80 + (salary-3000)*0.18;
            System.out.printf("$ %.2f%n", tax);
        }
        else if(salary > 4500){
            double tax = 80 + 270 + (salary-4500)*0.18;
            System.out.printf("$ %.2f%n", tax);
        }
        else{
            System.out.println("Salary can not be negative");
        }

        sc.close();
    }

}
