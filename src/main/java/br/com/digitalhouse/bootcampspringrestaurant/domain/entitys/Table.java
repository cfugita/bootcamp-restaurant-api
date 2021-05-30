package br.com.digitalhouse.bootcampspringrestaurant.domain.entitys;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private Integer id;
    private List<Order> orders;

    public Table(Integer id, List<Order> orders) {
        this.id = id;
        this.orders = orders;
    }

    public Table() {
        this.orders = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
