package entities;

import entities.enums.OrderStatus;

import java.util.Date;

public class Order {

    private Integer id;
    private Date date;
    private OrderStatus orderStatus;

    public Order() {
    }

    public Order(Integer id, Date date, OrderStatus orderStatus) {
        this.id = id;
        this.date = date;
        this.orderStatus = orderStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
