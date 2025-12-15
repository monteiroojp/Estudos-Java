package codigos_Aula;
import java.util.Locale;

public class JavaOutput {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        //Output with break line
        System.out.println("With break line");

        //Output without break line
        System.out.print("Without break line");
        System.out.println(" | second out to prove");

        //Output of variables
        byte number1 = 32;
        System.out.println(number1);

        //Output of decimal variables
        double number2 = 3.1428323;
        double number3 = 1.2141231;
        System.out.println(number2); //Default
        System.out.printf("First number:%.2f%nSecond Number:%.2f%n", number2, number3); //Formated

        //Concatenation
        String name = "Joao Pedro";
        char sex = 'M';
        double money = 10.59;
        System.out.println("Hi, my name is " + name + " .My sex is: " + sex + " and i have a total of " + money + " in my bank account");

        //Other example of Concatenation on printf
        String name2 = "Maria";
        int age = 31;
        double rent = 4000.0;
        System.out.printf("%s is %d year's old and has a salary of %.2f in total %n", name2, age, rent);

        //Exercise
        String product1 = "Computer";
        String product2 = "Office desk";
        int age2 = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n%n", product1, price1, product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age2, code, gender);
        System.out.printf("Measure with eight decimal places %.8f%nRounded (three decimal places): %.3f%n", measure, measure);
    }
}
