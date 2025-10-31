package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Collections;
import java.util.List;

@Service
public class CarService {
private final List<Car> cars = List.of(
        new Car("Toyta", "red", 2020),
        new Car("BMW", "black", 2002),
        new Car("Peugeot", "grey", 2004),
        new Car("Mini", "white", 2011),
        new Car("Audi", "blue", 2009)
        );
public List<Car> getCars (int count) {
    if(count >= cars.size()) return cars;
    if (0 >= count) return Collections.emptyList();
    return cars.subList(0, count);
}
}
