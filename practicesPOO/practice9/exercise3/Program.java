package practicesPOO.practice9.exercise3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine(); //Clear buffer
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);
        System.out.print("Enter the amount to withdraw: ");

        try{
            account.withdraw(sc.nextDouble());
            System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
    }
}
