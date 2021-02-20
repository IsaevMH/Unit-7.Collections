package Collections.entities;

import Collections.interfaces.BodyType;
import Collections.interfaces.GasolineType;

public class PetrolEngineCar extends PassengerCar {
    private GasolineType gasolineType;

    public PetrolEngineCar(String brandName, String modelName, long price, double fuelUsageOnHudredKilometers, int maxSpeed, String colour, BodyType bodyType, int countPassenger, GasolineType gasolineType, double weightInTons) {
        super(brandName, modelName, price, fuelUsageOnHudredKilometers, maxSpeed, colour, bodyType, countPassenger, weightInTons);
        this.gasolineType = gasolineType;
    }
}
