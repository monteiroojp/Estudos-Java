package practicesPOO.practice8.exercise1;

public class Program {
    public static void main(String[] args){
        //Example accounts
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 3.0, 500.0);

        //Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 50.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 30.0, 0.01);

        //Downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2; //Correct : Despite acc2 has the type Account, the instance is of a BusinessAccount
        acc4.loan(100.0);
        //BusinessAccount acc5 = (BusinessAccount) acc; //Error : Acc original type is Account
        //BusinessAccount acc6 = (BusinessAccount) acc3 //Error : Acc original type is SavingsAccount

        //How to secure that the dowcasting is possible
        if(acc2 instanceof BusinessAccount){
            BusinessAccount acc7 = (BusinessAccount) acc2;
            acc7.loan(150.0);
            System.out.println("Loan done!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc8 = (SavingsAccount) acc3;
            acc8.updateBalance();
            System.out.println("Balance updated!");
        }

        //Override tests
        Account acc9 = new Account(1001, "Alex", 1000.0);
        acc9.withdraw(200.0);
        System.out.println(acc9.getBalance());

        Account acc10 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc10.withdraw(200.0);
        System.out.println(acc10.getBalance());

        Account acc11 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc11.withdraw(200.0);
        System.out.println(acc11.getBalance());

    }
}
