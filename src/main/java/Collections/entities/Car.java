package Collections.entities;

import Collections.interfaces.BodyType;
import Collections.interfaces.FuelType;

public class Car extends Transport{
    private String brandName;
    private String modelName;
    private long price;
    private double fuelUsageOnHudredKilometers;
    private String colour;
    private BodyType bodyType;

    public Car(String brandName, String modelName, long price, double fuelUsageOnHudredKilometers, String colour, BodyType bodyType, int countPassenger, double weightInKilograms, int maxSpeed, FuelType fuelType) {
        super(countPassenger, weightInKilograms, maxSpeed, fuelType);
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
        this.fuelUsageOnHudredKilometers = fuelUsageOnHudredKilometers;
        this.colour = colour;
        this.bodyType = bodyType;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }


    public String getColour() {
        return colour;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public long getPrice() {
        return price;
    }

    public double getFuelUsageOnHudredKilometers() {
        return fuelUsageOnHudredKilometers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                ", fuelUsageOnHudredKilometers=" + fuelUsageOnHudredKilometers +
                ", maxSpeed=" + getMaxSpeed() +
                ", colour='" + colour + '\'' +
                ", bodyType=" + bodyType +
                ", weightInTons=" + getWeightInKilograms() +
                '}';
    }

    @Override
    public void move(int distance) {

    }

    @Override
    public void stop() {

    }
}