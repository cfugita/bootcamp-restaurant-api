package br.com.digitalhouse.bootcampspringrestaurant.controllers;

import br.com.digitalhouse.bootcampspringrestaurant.usecases.RestaurantUseCase;
import br.com.digitalhouse.bootcampspringrestaurant.usecases.models.response.TableResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    RestaurantUseCase restaurantUseCase;

    public RestaurantController(RestaurantUseCase restaurantUseCase) {
        this.restaurantUseCase = restaurantUseCase;
    }

    @GetMapping("/{tableId}")
    ResponseEntity<Object> getTable(@PathVariable("tableId") Integer tableId) {

        try {
            return new ResponseEntity<>(this.restaurantUseCase.getTable(tableId), HttpStatus.OK);
        } catch (RuntimeException ex) {

            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception ex) {

            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
