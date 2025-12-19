package basics;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxNumber = max(a,b,c);
        showResult(maxNumber);
        sc.close();
    }

    //Function that return the max number in three numbers;
    public static int max(int x, int y, int z){
        if(x>y && x>z)
            return x;
        else if(y>z)
            return y;
        else
            return z;
    }

    //Function that outputs the max value
    public static void showResult(int value){
        System.out.println("Higher: " + value);
    }
}
