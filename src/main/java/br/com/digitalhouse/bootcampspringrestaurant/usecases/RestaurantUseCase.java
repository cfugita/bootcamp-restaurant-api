package br.com.digitalhouse.bootcampspringrestaurant.usecases;

import br.com.digitalhouse.bootcampspringrestaurant.usecases.models.response.TableResponse;

public interface RestaurantUseCase {
    TableResponse getTable (Integer tableId);
}
