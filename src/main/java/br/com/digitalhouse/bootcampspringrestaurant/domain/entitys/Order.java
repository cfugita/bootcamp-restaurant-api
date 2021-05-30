package br.com.digitalhouse.bootcampspringrestaurant.domain.entitys;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id;
    private Integer tableId;
    private List<Dish> dishes;

    public Order(Integer id, Integer tableId, List<Dish> dishes) {
        this.id = id;
        this.tableId = tableId;
        this.dishes = dishes;
    }

    public Order() {
        this.dishes = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
