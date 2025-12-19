package basics;
import java.util.Locale;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] heights = new double[n];
        for(int i=0; i<n; i++) heights[i] = sc.nextDouble();

        double media = 0.0;
        for(int i=0; i<n; i++) media += heights[i];
        System.out.printf("AVERAGE HEIGHT = %.2f", media/n);

        sc.close();
    }
}
