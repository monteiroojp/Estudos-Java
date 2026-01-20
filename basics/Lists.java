package basics;
import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args){
        //Initialization
        List<String> names = new ArrayList<>();

        //Add method
        names.add("Alex");
        names.add("Adrian");
        names.add("Maria");
        names.add("Joao");
        names.add("Bob");
        names.add(2, "Marco");

        //Size
        System.out.println(names.size());
        for(String name : names) System.out.println(name);

        //Remove methods
        System.out.println("--------------");
        names.remove(3);
        names.remove("Bob");
        for(String name : names) System.out.println(name);
        System.out.println("--------------");
        names.removeIf(x-> x.charAt(0) == 'M');
        for(String name : names) System.out.println(name);

        //Get the index by the value
        names.add("Alex");
        System.out.println("Index of Alex: " + names.indexOf("Alex"));
        System.out.println("Last index of Alex: " + names.lastIndexOf("Alex"));
        System.out.println("Index of Francisco: " + names.indexOf("Francisco"));
    }
}
