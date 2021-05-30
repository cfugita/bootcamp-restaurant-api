package br.com.digitalhouse.bootcampspringrestaurant.usecases.impl;

import br.com.digitalhouse.bootcampspringrestaurant.domain.entitys.Dish;
import br.com.digitalhouse.bootcampspringrestaurant.domain.entitys.Order;
import br.com.digitalhouse.bootcampspringrestaurant.domain.entitys.Table;
import br.com.digitalhouse.bootcampspringrestaurant.domain.gateways.RestaurantGateway;
import br.com.digitalhouse.bootcampspringrestaurant.usecases.RestaurantUseCase;
import br.com.digitalhouse.bootcampspringrestaurant.usecases.models.response.DishResponse;
import br.com.digitalhouse.bootcampspringrestaurant.usecases.models.response.OrderResponse;
import br.com.digitalhouse.bootcampspringrestaurant.usecases.models.response.TableResponse;
import org.springframework.stereotype.Service;


@Service
public class RestaurantUseCaseImpl implements RestaurantUseCase {

    RestaurantGateway restaurantGateway;

    public RestaurantUseCaseImpl(RestaurantGateway restaurantGateway) {
        this.restaurantGateway = restaurantGateway;
    }

    @Override
    public TableResponse getTable(Integer tableId) {

        Table table = this.restaurantGateway.getTable(tableId).get(0);
        TableResponse tableResponse = new TableResponse();
        double totalValueTable = 0, totalValueOrder;

        for(Order order : table.getOrders()) {
            OrderResponse orderResponse = new OrderResponse();
            totalValueOrder = 0;
            for(Dish dish : order.getDishes()) {
                totalValueOrder += dish.getPrice() * dish.getQuantity();
                DishResponse dishResponse = new DishResponse(dish.getPrice(),dish.getDescription(), dish.getQuantity());
                orderResponse.getDishResponse().add(dishResponse);
            }
            orderResponse.setTotalValue(totalValueOrder);
            totalValueTable += totalValueOrder;
            tableResponse.getOrderResponse().add(orderResponse);
        }

        tableResponse.setTotalValue(totalValueTable);

        return tableResponse;
    }
}
