package practicesPOO.practice5.exercise2;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();

        System.out.print("Is there a initial deposit value (y/n)? ");
        char answer = sc.next().charAt(0);

        BankAccount account;
        if(answer == 'y' || answer == 'Y'){
            System.out.print("Enter the initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(numberAccount, holderName, initialDeposit);
        }
        else {
            account = new BankAccount(numberAccount, holderName);
        }

        System.out.printf("Account data: %n%s%n", account.toString());

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);
        System.out.printf("Updated data: %n%s%n", account.toString());
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.printf("Updated data: %n%s%n", account.toString());

        sc.close();
    }
}
