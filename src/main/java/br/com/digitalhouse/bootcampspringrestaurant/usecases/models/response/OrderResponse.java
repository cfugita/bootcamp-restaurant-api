package br.com.digitalhouse.bootcampspringrestaurant.usecases.models.response;

import java.util.ArrayList;
import java.util.List;

public class OrderResponse {
    private List<DishResponse> dishResponse;
    private double totalValue;

    public OrderResponse(List<DishResponse> dishResponse, double totalValue) {
        this.dishResponse = dishResponse;
        this.totalValue = totalValue;
    }

    public OrderResponse() {
        this.dishResponse = new ArrayList<>();
    }

    public List<DishResponse> getDishResponse() {
        return dishResponse;
    }

    public void setDishResponse(List<DishResponse> dishResponse) {
        this.dishResponse = dishResponse;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
