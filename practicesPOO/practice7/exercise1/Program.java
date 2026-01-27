package practicesPOO.practice7.exercise1;

import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args){
        //Instance
        Order order = new Order(328, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
        OrderStatus status1 = OrderStatus.SHIPPED;

        //Output
        System.out.println(order);
        System.out.println(status1.toString());
        System.out.println("All constants associates on StatusOrder enum: ");
        for(OrderStatus status : OrderStatus.values()) System.out.println(status.toString());
        System.out.println(OrderStatus.valueOf("PENDING_PAYMENT").toString());
    }
}
