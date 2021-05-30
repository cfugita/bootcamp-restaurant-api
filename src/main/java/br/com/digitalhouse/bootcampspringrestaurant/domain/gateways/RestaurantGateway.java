package br.com.digitalhouse.bootcampspringrestaurant.domain.gateways;

import br.com.digitalhouse.bootcampspringrestaurant.domain.entitys.Table;

import java.util.List;

public interface RestaurantGateway {
    List<Table> getTable (Integer tableId);
}
