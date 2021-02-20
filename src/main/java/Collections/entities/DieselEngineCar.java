package Collections.entities;

import Collections.interfaces.BodyType;
import Collections.interfaces.DieselType;

public class DieselEngineCar extends PassengerCar{
    private DieselType dieselFuel;

    public DieselEngineCar(String brandName, String modelName, long price, double fuelUsageOnHudredKilometers, int maxSpeed, String colour, BodyType bodyType, int countPassenger, DieselType dieselType, double weightInTons) {
        super(brandName, modelName, price, fuelUsageOnHudredKilometers, maxSpeed, colour, bodyType, countPassenger, weightInTons);
        this.dieselFuel = dieselType;
    }
}
