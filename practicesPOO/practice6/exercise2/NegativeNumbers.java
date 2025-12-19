package practicesPOO.practice6.exercise2;
import java.util.Locale;
import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i<numbers.length; i++) numbers[i] = sc.nextInt();

        for(int i=0; i<numbers.length; i++) if(numbers[i] < 0 ) System.out.println(numbers[i]);

        sc.close();
    }
}
