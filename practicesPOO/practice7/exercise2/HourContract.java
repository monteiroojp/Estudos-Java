package practicesPOO.practice7.exercise2;

import java.time.LocalDate;

public class HourContract {
    //Attributes
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    //Constructor
    HourContract(LocalDate date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    //Getters
    public LocalDate getDate() {return date;}
    public Double getValuePerHour() {return valuePerHour;}
    public Integer getHours() {return hours;}

    //Setters
    public void setDate(LocalDate date) {this.date = date;}
    public void setValuePerHour(Double valuePerHour) {this.valuePerHour = valuePerHour;}
    public void setHours(Integer hours) {this.hours = hours;}

    //totalValue
    public Double totalValue(){
        return valuePerHour*hours;
    }
}
