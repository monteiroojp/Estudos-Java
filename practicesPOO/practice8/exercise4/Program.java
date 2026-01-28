package practicesPOO.practice8.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");

        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.print("Natural or legal person (n/l)? ");
            char answer = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine(); //Clear buffer
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();

            if(answer == 'n' || answer == 'N'){
                System.out.print("Health expenses: ");
                Double healthExpenses = sc.nextDouble();
                persons.add(new NaturalPerson(name, annualIncome, healthExpenses));
            }
            else if(answer == 'l' || answer == 'L'){
                System.out.print("Number of employees: ");
                Integer hiredEmployees = sc.nextInt();
                persons.add(new LegalPerson(name, annualIncome, hiredEmployees));
            }
        }

        System.out.println("\nTAXES PAID:");
        double totalSum = 0;
        for(int i=0; i<n; i++){
            System.out.printf("%s: $ %.2f%n", persons.get(i).getName(), persons.get(i).calculateIncomeTax());
            totalSum += persons.get(i).calculateIncomeTax();
        }

        System.out.printf("%nTOTAL TAXES: %.2f", totalSum);
    }
}
