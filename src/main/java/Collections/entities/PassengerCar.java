package Collections.entities;

import Collections.interfaces.BodyType;

import java.util.Scanner;

public class PassengerCar extends Car{

    public PassengerCar(String brandName, String modelName, long price, double fuelUsageOnHudredKilometers, int maxSpeed, String colour, BodyType bodyType, int countPassenger, double weightInTons) {
        super(brandName, modelName, price, fuelUsageOnHudredKilometers, maxSpeed, colour, bodyType, weightInTons);
        this.countPassenger = countPassenger;
    }
    private int countPassenger;
    Scanner in;
}
