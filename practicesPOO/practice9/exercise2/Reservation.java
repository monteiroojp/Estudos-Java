package practicesPOO.practice9.exercise2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {}

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException{
        if(Duration.between(LocalDate.now().atStartOfDay(), checkin.atStartOfDay()).toDays() <= 0)
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates");

        if(Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay()).toDays() <= 0 ||
            Duration.between(checkout.atStartOfDay(), checkout.atStartOfDay()).toDays() <= 0)
            throw new DomainException("Error in reservation: Check-in or/and Check-out  date must be after check-in date");

        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public long duration(){
        return Duration.between(checkout.atStartOfDay(), checkin.atStartOfDay()).toDays();
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException{
        if(Duration.between(LocalDate.now().atStartOfDay(), checkin.atStartOfDay()).toDays() <= 0)
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates");

        if(Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay()).toDays() <= 0 ||
            Duration.between(checkout.atStartOfDay(), checkout.atStartOfDay()).toDays() <= 0)
            throw new DomainException("Error in reservation: Check-in or/and Check-out  date must be after check-in date");

        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString(){
        return String.format("Reservation: Room %d, check-in: %s, checkout: %s, %d",
                roomNumber,
                checkin.format(fmt),
                checkout.format(fmt),
                duration());
    }



}
