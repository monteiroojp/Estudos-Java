package practicesPOO.practice6.exercise3;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many peoples will be stored? ");
        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for(int i=0; i<persons.length; i++){
            System.out.println("Data from " + (i+1) + "a person:");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            persons[i] = new Person(name, age, height);
        }

        double media = 0.0;
        int lessThan16 = 0;
        String namesLessThan16 = "";

        for(int i=0; i<persons.length; i++){
            media += persons[i].getHeight();
            if(persons[i].getAge() < 16){
                lessThan16++;
                namesLessThan16 += (persons[i].getName() + "\n");
            }
        }

        double percentage = lessThan16*100.0/ persons.length;
        System.out.printf("Medium height: %.2f%nPersons younger than 16 year's old: %.1f%%%n%s", media/persons.length, percentage, namesLessThan16);

        sc.close();
    }
}
