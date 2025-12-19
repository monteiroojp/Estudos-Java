package practicesPOO.practice6.exercise4;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Room[] rooms = new Room[10];

        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Rent #" + (i+1));
            sc.nextLine(); //Clears the buffer
            System.out.print("Name: ");
            String temporaryOwner = sc.nextLine();
            System.out.print("Email: ");
            String ownerEmail = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Room(temporaryOwner, ownerEmail);
        }

        System.out.println("Busy rooms:");
        for(int i=0; i<10; i++){
            if(rooms[i] != null){
                System.out.printf("%d: %s, %s%n", i, rooms[i].getTemporaryOwner(), rooms[i].getOwnerEmail());
            }
        }

        sc.close();
    }
}
