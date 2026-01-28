package practicesPOO.practice8.exercise2;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<Employee>(n);
        for(int i=0; i<n; i++){
            System.out.println("Employee #" + (i+1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine(); // Clear buffer
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if(answer == 'n' || answer == 'N')
                employees.add(new Employee(name, hours, valuePerHour));
            else if(answer == 'y' || answer == 'Y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
        }

        System.out.println("%nPayments: ");
        for(int i=0; i<n; i++) System.out.printf("%s - $ %.2f%n", employees.get(i).getName(), employees.get(i).payment());

        sc.close();

    }
}
