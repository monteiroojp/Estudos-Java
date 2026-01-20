package basics;

public class DataWrapping {
    public static void main(String[] args) {
        //Primitive datatypes
        int a = 3;
        float b = 3.5f;
        double c = 3.14;
        char d = 'y';
        boolean ok = true;

        //Auto boxing Wrappers
        Integer a1 = a;
        Float b1 = b;
        Double c1 = c;
        Character d1 = d;
        Boolean ok1 = ok;

        //Boxing to more basic objects
        Number a2 = a; // Integer "is a" Number
        Number b2 = b; // Float "is a" Number
        Object a3 = a; // All objects extend from the class object
        Object d2 = d;

        //Auto unboxing
        int a4 = a1;
        double c4 = c1;
        boolean ok4 = ok1;

        //Unboxing from more basics objects(Need casting)
        int a5 = (int) a2;
        float b5 = (float) b2;
        char d5 = (char) d2;

        //Capacity of store null in these variables
        a1 = null;
        b1 = null;
        ok1 = null;
    }
}