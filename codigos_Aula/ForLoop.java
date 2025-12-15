package codigos_Aula;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        //Sum of n numbers
        Scanner sc = new Scanner(System.in);

        //Input of the total of numbers
        int n = sc.nextInt();

        //Reads all the numbers
        int total = 0;
        for(int i=0; i<n; i++){
            total += sc.nextInt();
        }

        //Output the total sum
        System.out.println(total);


        //Exercise(For all int until a number. Output the square and the cube)
        int m = sc.nextInt();
        for(int i=1; i<=m; i++){
            System.out.printf("%d %.0f %.0f%n", i, Math.pow(i,2), Math.pow(i,3));
        }

        sc.close();
    }
}
