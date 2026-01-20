package basics;
import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i<numbers.length; i++) numbers[i] = sc.nextInt();

        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        System.out.println("Total sum: " + sum);

        sc.close();
    }
}
