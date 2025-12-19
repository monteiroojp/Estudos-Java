package basics;
import java.util.Scanner;
import java.util.Locale;

public class JavaInput {
    public static void main(String[] args){
        //Scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Strings inputs
        String nome1, nome2;
        nome1 = sc.next(); //Read until any delimitator
        sc.nextLine(); //Clears the buffer
        nome2 = sc.nextLine(); //Read until the break line
        System.out.printf("%s%n%s%n", nome1, nome2);

        //Int inputs
        int numberInt1 = sc.nextInt();
        byte numberInt2 = sc.nextByte();
        long numberInt3 = sc.nextLong();
        System.out.printf("%d%n%d%n%d%n", numberInt1, numberInt2, numberInt3);

        //Double inputs(Always consider the local system notation for decimals numbers)
        double numberDouble =  sc.nextDouble();
        System.out.printf("%f%n", numberDouble);

        //Chars inputs
        char character1 = sc.next().charAt(0); //Reads from a string tha goes just until the first delimitator
        sc.nextLine(); //Clears the buffer
        char character2 = sc.nextLine().charAt(6); //Reads from a string tha goes until the first \n
        System.out.printf("%c %c%n", character1, character2);

        //The buffer also has to be cleared when reading variables with others methods than the next()
        int numberInt4 = sc.nextInt();
        sc.nextLine(); //Clears the buffer
        String string = sc.nextLine();
        sc.close(); //Close the stream
    }
}
