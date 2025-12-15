package codigos_Aula;

public class Casting {
    public static void main(String[] args){
        int a = 5;
        int b = 2;

        //No casting
        double result1 = a/b;
        System.out.println(result1);

        //Casting
        double result2 = (double) a/b;
        System.out.println(result2);
    }
}
