package br.com.digitalhouse.bootcampspringrestaurant.usecases.models.response;

import java.util.ArrayList;
import java.util.List;

public class TableResponse {
    private List<OrderResponse> orderResponse;
    private double totalValue;

    public TableResponse(List<OrderResponse> orderResponse, double totalValue) {
        this.orderResponse = orderResponse;
        this.totalValue = totalValue;
    }

    public TableResponse() {
        this.orderResponse = new ArrayList<>();
    }

    public List<OrderResponse> getOrderResponse() {
        return orderResponse;
    }

    public void setOrderResponse(List<OrderResponse> orderResponse) {
        this.orderResponse = orderResponse;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
