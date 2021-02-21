package Collections.entities;

import Collections.interfaces.BodyType;

public abstract class Car {
    private String brandName;
    private String modelName;
    private long price;
    private double fuelUsageOnHudredKilometers;
    private int maxSpeed;
    private String colour;
    private BodyType bodyType;
    private double weightInTons;

    public Car(String brandName, String modelName, long price, double fuelUsageOnHudredKilometers, int maxSpeed, String colour, BodyType bodyType, double weightInTons) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
        this.fuelUsageOnHudredKilometers = fuelUsageOnHudredKilometers;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.bodyType = bodyType;
        this.weightInTons = weightInTons;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColour() {
        return colour;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public double getWeightInTons() {
        return weightInTons;
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
                ", maxSpeed=" + maxSpeed +
                ", colour='" + colour + '\'' +
                ", bodyType=" + bodyType +
                ", weightInTons=" + weightInTons +
                '}';
    }
}