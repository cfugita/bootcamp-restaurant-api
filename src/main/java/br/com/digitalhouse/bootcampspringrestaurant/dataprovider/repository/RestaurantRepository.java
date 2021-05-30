package br.com.digitalhouse.bootcampspringrestaurant.dataprovider.repository;

import br.com.digitalhouse.bootcampspringrestaurant.domain.entitys.Table;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RestaurantRepository {
    public static List<Table> getTable(Integer tableId) {
        try {
            File file = ResourceUtils.getFile("file:src/main/resources/restaurant.json");
            ObjectMapper objectMapper = new ObjectMapper();

            var listTable = objectMapper.readValue(file, new TypeReference<List<Table>>() {
            });

            return listTable.stream().filter(s -> s.getId()
                    .equals(tableId)).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
