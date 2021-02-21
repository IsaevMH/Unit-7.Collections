package Collections.entities;

import Collections.interfaces.BodyType;
import Collections.interfaces.FuelType;

public class Passenger extends Car{
    public Passenger(String brandName, String modelName, long price, double fuelUsageOnHudredKilometers, String colour, BodyType bodyType, int countPassenger, double weightInKilograms, int maxSpeed, FuelType fuelType) {
        super(brandName, modelName, price, fuelUsageOnHudredKilometers, colour, bodyType, countPassenger, weightInKilograms, maxSpeed, fuelType);
    }
}
