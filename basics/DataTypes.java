package basics;

public class DataTypes {
    public static void main(String[] args){
        //Datatype for int values;
        byte numberInt1 = 125;
        short numberInt2 = 4314;
        int numberInt3 = 20000000;
        long numberInt4 = 1000000000;

        //Datatype for decimal numbers
        float floatNumber = 1.38328138213218321f;
        double doubleNumber = 3.14218421848214481843143814831;

        //Booleans
        boolean bool = true;

        //Char and strings
        char character = 'F';
        String string = "Hello world";

        //Out
        System.out.println("--- Datatype for int values ---");
        System.out.println("Byte (125): " + numberInt1);
        System.out.println("Short (4314): " + numberInt2);
        System.out.println("Int (20 millions): " + numberInt3);
        System.out.println("Long (10 billions): " + numberInt4);
        System.out.println("\n--- Decimal numbers ---");
        System.out.println("Float (32-bit): " + floatNumber);
        System.out.println("Double (64-bit): " + doubleNumber);
        System.out.println("\n--- Booleans ---");
        System.out.println("Boolean: " + bool);
        System.out.println("\n--- Chars and Strings ---");
        System.out.println("Char (character): " + character);
        System.out.println("String (Text): " + string);
    }
}
