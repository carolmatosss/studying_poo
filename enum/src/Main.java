import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(3, new Date(), OrderStatus.PENDING);

        System.out.println(order);

        //Metodo valueof, para istanciar inserçao do usuario como instancia do enum

        OrderStatus orderStatus = OrderStatus.FINISHED;

        OrderStatus orderStatus1 = OrderStatus.valueOf("PROCESSING");

        System.out.println(orderStatus1);

    }
    }
