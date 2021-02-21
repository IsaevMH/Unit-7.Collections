import Collections.entities.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiPark {
    private List<? extends Car> cars;
    private long parkPrice;

    public TaxiPark(List<? extends Car> cars) {
        this.cars = cars;
    }

    public void showParkPrice() {
        cars.forEach(car -> parkPrice += car.getPrice());
        System.out.println(parkPrice);
    }

    public void sortByMaxFuelUsages() {
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car firstCar, Car secondCar) {
                double delta = firstCar.getFuelUsageOnHudredKilometers() - secondCar.getFuelUsageOnHudredKilometers();
                if(delta > 0.00001)
                    return 1;
                else
                    return -1;
            }
        });
    }
    public void showCarsInRangeOfSpeed(int minimalValueOfSpeed, int maximumValueOfSpeed){
        System.out.println(cars.stream().filter(car -> car.getMaxSpeed() <= maximumValueOfSpeed
                && car.getMaxSpeed() >= minimalValueOfSpeed).collect(Collectors.toList()).toString());
    }
}
