package practicesPOO.practice7.exercise2;

import java.time.YearMonth;
import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Department
        System.out.print("Enter department's name: ");
        String name1 = sc.nextLine();

        //Worker
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.next();
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name2, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(name1));

        //Contracts
        System.out.print("How many contracts to this worker? ");
        int quantity = sc.nextInt();

        for(int i=1; i<=quantity; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.next();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer duration = sc.nextInt();

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            HourContract contract = new HourContract(LocalDate.parse(date, fmt), valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/yyyy");
        String dateString = sc.next();
        YearMonth date = YearMonth.parse(dateString, fmt);
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f", dateString, worker.income(date.getYear(), date.getMonthValue()));

        //Close reading
        sc.close();
    }
}
