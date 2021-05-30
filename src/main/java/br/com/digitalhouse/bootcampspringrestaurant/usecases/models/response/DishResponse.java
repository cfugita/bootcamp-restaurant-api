package br.com.digitalhouse.bootcampspringrestaurant.usecases.models.response;

public class DishResponse {
    private double price;
    private String description;
    private Integer quantity;

    public DishResponse(double price, String description, Integer quantity) {
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public DishResponse() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
