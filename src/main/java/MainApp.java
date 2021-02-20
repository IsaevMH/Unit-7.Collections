import Collections.entities.Car;
import Collections.entities.DieselEngineCar;
import Collections.entities.PetrolEngineCar;
import Collections.interfaces.BodyType;
import Collections.interfaces.DieselType;
import Collections.interfaces.GasolineType;

import java.util.*;
import java.util.List;

public class MainApp {
   static List<Car> cars = Arrays.asList(
           new DieselEngineCar("Kia", "Carnival", 3_599_000, 9.0, 300, "Red", BodyType.WAGON, 7, DieselType.DIESEL, 3.5),
            new PetrolEngineCar("Huyndai", "Solaris", 1_099_000, 6.6, 220, "Red", BodyType.SEDAN, 5, GasolineType.AI_92, 1.2),
            new PetrolEngineCar("Huyndai", "Elantra", 1_599_000, 6.0, 250, "Red", BodyType.SEDAN, 5, GasolineType.AI_95, 1.5)

    );

    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark(cars);

        taxiPark.sortByMaxFuelUsages();
        for (Car car : cars) {
            System.out.println(car.getBrandName() + " " + car.getModelName() + " " + car.getFuelUsageOnHudredKilometers());
        }

        System.out.println(taxiPark.getParkPrice());

        for (Car car :  taxiPark.findCarsInParticularRangeOfSpeed(299, 400)) {
            System.out.println(car.getBrandName() + " " + car.getModelName() + " " + car.getFuelUsageOnHudredKilometers() + " " + car.getMaxSpeed());

        }


    }
}
