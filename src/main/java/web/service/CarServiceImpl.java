package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carsList;

    public CarServiceImpl() {
        carsList = new ArrayList<>();
        carsList.add(new Car("model1", 1, 2001));
        carsList.add(new Car("model2", 2, 2002));
        carsList.add(new Car("model3", 3, 2003));
        carsList.add(new Car("model4", 4, 2004));
        carsList.add(new Car("model5", 5, 2005));
    }

    @Override
    public List<Car> carListByCount(int count) {
        return carsList.stream().limit(count).toList();
    }
}
