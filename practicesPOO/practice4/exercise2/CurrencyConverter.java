package practicesPOO.practice4.exercise2;

public class CurrencyConverter {
    public static double rate;

    public static double dollarToReal(double valueDollar){
        return valueDollar*rate + (valueDollar*rate*0.06);
    }

}
