import Collections.entities.Car;
import Collections.entities.Passenger;
import Collections.interfaces.BodyType;
import Collections.interfaces.FuelType;

import java.util.*;
import java.util.List;

public class MainApp {
   static List<Car> cars = Arrays.asList(
           new Passenger("Kia", "Carnival", 3_599_000, 9.0, "Red",  BodyType.WAGON, 7, 1100, 300, FuelType.DIESEL),
           new Passenger("Huyndai", "Solaris", 1_099_000, 6.6, "Blue",  BodyType.SEDAN, 5, 1100, 300, FuelType.PETROL),
           new Passenger("Huyndai", "Elantra", 1_599_000, 6.0, "Green",  BodyType.SEDAN, 5, 1100, 300, FuelType.PETROL)
    );

    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark(cars);

        taxiPark.sortByMaxFuelUsages();
        cars.forEach(System.out::println);

        taxiPark.showParkPrice();

        taxiPark.showCarsInRangeOfSpeed(299,400);


    }
}
