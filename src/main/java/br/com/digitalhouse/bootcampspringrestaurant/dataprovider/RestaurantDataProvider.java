package br.com.digitalhouse.bootcampspringrestaurant.dataprovider;

import br.com.digitalhouse.bootcampspringrestaurant.dataprovider.repository.RestaurantRepository;
import br.com.digitalhouse.bootcampspringrestaurant.domain.entitys.Table;
import br.com.digitalhouse.bootcampspringrestaurant.domain.gateways.RestaurantGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantDataProvider implements RestaurantGateway {
    @Override
    public List<Table> getTable(Integer tableId) {
        return RestaurantRepository.getTable(tableId);
    }
}
