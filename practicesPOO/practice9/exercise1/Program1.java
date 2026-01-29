package practicesPOO.practice9.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] vector = sc.nextLine().split(" ");

        try{
            int position = sc.nextInt();
            System.out.println(vector[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("The index must be on interval [0," + vector.length + ")");
        }
        catch (InputMismatchException e){
            System.out.println("The position must be a integer");
        }
        catch (Exception e){
            System.out.println("Something went wrong, try again later");
        }
        finally {
            System.out.println("Program finished");
        }


        sc.close();
    }
}
