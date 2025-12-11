package codigos_Aula;

public class Casting {
    public static void main(String[] args){
        int a = 5;
        int b = 2;

        //No casting
        double resultado1 = a/b;
        System.out.println(resultado1);

        //Casting
        double resultado2 = (double) a/b;
        System.out.println(resultado2);
    }
}
