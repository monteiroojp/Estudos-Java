package codigos_Aula;

public class BasicStringMethods {
    public static void main(String[] args){
        String base = "abcde FGHIJ ABC abc DEFG  ";

        //To lowerCase
        System.out.println("-" + base.toLowerCase() + "-");

        //To upperCase
        System.out.println("-" + base.toUpperCase() + "-");

        //Trim(Removes the empty spaces)
        System.out.println("-" + base.trim() + "-");

        //Substring(Return a subset of a string from an interval)
        System.out.println(base.substring(2));
        System.out.println(base.substring(2, 6));

        //IndexOf e lastIndexOf
        System.out.println("Index of: " + base.indexOf("bc"));
        System.out.println("Last index of: " + base.lastIndexOf("bc"));

        //Split
        String s = "potato apple lemon";
        String[] vector = s.split(" ");
        for(int i=0; i< vector.length; i++)
            System.out.println(vector[i]);

        //Replace
        String r = "i luve the smell of fresh coffe";
        String midStep = r.replace("u", "o");
        String result = midStep.replace("coffe", "coffee");
        System.out.println(result);
    }
}
