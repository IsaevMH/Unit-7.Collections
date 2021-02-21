package Collections.entities;

import Collections.interfaces.BodyType;
import Collections.interfaces.FuelType;

public class Truck extends Car{
    public Truck(String brandName, String modelName, long price, double fuelUsageOnHudredKilometers, String colour, BodyType bodyType, int countPassenger, double weightInKilograms, int maxSpeed, FuelType fuelType) {
        super(brandName, modelName, price, fuelUsageOnHudredKilometers, colour, bodyType, countPassenger, weightInKilograms, maxSpeed, fuelType);
    }
}
