package codigos_Aula;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        int total = 0;
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        while(x!=0) {
            total += x;
            x = sc.nextInt();
        }
        System.out.println("Sum: " + total);

        //Exercise(Counting the sum of choices of the numbers in int interval[1,3], while 4 ends the loop)
        int choice = sc.nextInt();
        int alcool = 0;
        int gasoline = 0;
        int diesel = 0;

        while(choice != 4){
            if(choice == 1)
                alcool++;
            else if(choice == 2)
                gasoline++;
            else if(choice == 3)
                diesel++;

            choice = sc.nextInt();
        }

        System.out.printf("Thank you!%nAlcool: %d%nGasoline: %d%nDiesel: %d%n", alcool, gasoline, diesel);
        sc.close();
    }
}
