package practicesPOO.practice9.exercise2;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Room: ");
        Integer roomNumber = sc.nextInt();
        System.out.print("Check-in date(dd/MM/yyyy): ");
        String checkin = sc.next();
        System.out.print("Check-out date(dd/MM/yyyy): ");
        String checkout = sc.next();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{
            Reservation reservation = new Reservation(roomNumber, LocalDate.parse(checkin, fmt), LocalDate.parse(checkout, fmt));
            System.out.println(reservation.toString());
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date(dd/MM/yyyy): ");
            String updatedCheckin = sc.next();
            System.out.print("Check-out date(dd/MM/yyyy): ");
            String updatedCheckout = sc.next();
            reservation.updateDates(LocalDate.parse(updatedCheckin, fmt), LocalDate.parse(updatedCheckout, fmt));
            System.out.println(reservation.toString());
        }
        catch (DomainException e){
            System.out.print(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Something went wrong. Try again later");
        }

        sc.close();
    }
}
