package practicesPOO.practice7.exercise1;

import java.time.LocalDateTime;

public class Order {
    private Integer id;
    private LocalDateTime moment;
    private OrderStatus status;

    //Constructors
    public Order(){

    }

    public Order(Integer id, LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
        this.id = id;
    }

    //Getters
    public Integer getId() {return id;}
    public LocalDateTime getMoment() {return moment;}
    public OrderStatus getStatus() {return status;}

    //Setters
    public void setId(Integer id) {this.id = id;}
    public void setMoment(LocalDateTime moment) {this.moment = moment;}
    public void setStatus(OrderStatus status) {this.status = status;}

    //To string

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
